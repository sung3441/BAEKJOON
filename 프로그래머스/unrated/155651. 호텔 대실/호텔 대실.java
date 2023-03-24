import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[][] book_time) {
        Hotel hotel = new Hotel();
        List<Customer> customers = Arrays.stream(book_time)
                .map(strings -> new Customer(strings[0], strings[1]))
                .sorted(Comparator.comparingInt(o -> o.checkinTime))
                .collect(Collectors.toList());

        for (Customer customer : customers) {
            hotel.checkIn(customer);
        }
        return hotel.rooms.size();
    }
}

class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();

    void checkIn(Customer customer) {
        Room room = findEmptyRoom(customer.checkinTime);
        room.cleaningRoom(customer.checkoutTime);
        roomArrangement();
    }

    void roomArrangement() {
        rooms.sort(Comparator.comparingInt(o -> o.lastCleaningTime));
    }

    Room findEmptyRoom(int checkinTime) {
        for (Room room : rooms) {
            if (room.isVacant(checkinTime)) {
                return room;
            }
        }
        rooms.add(new Room());
        return rooms.get(rooms.size() - 1);
    }
}

class Room {
    int lastCleaningTime = 0;

    boolean isVacant(int checkInTime) {
        return lastCleaningTime <= checkInTime;
    }

    void cleaningRoom(int checkoutTime) {
        lastCleaningTime = checkoutTime + 600;
    }
}

class Customer {
    // 0 ~ 86,340
    int checkinTime;
    int checkoutTime;

    public Customer(String checkinTime, String checkoutTime) {
        this.checkinTime = stringTimeToIntTime(checkinTime);
        this.checkoutTime = stringTimeToIntTime(checkoutTime);
    }

    int stringTimeToIntTime(String time) {
        String[] split = time.split(":");
        return (Integer.parseInt(split[0]) * 60 * 60) + (Integer.parseInt(split[1]) * 60);
    }
}