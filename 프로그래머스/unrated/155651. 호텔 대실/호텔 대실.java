import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[][] book_time) {
        ArrayList<Room> rooms = new ArrayList<>();
        List<Customer> customers = Arrays.stream(book_time)
                .map(strings -> new Customer(strings[0], strings[1]))
                .sorted(Comparator.comparingInt(o -> o.startTime))
                .collect(Collectors.toList());

        for (Customer customer : customers) {
            if (!checkIn(rooms, customer)) {
                Room newRoom = new Room();
                newRoom.changeLastEndTime(customer.endTime);
                rooms.add(newRoom);
            }
            rooms.sort(Comparator.comparingInt(o -> o.lastEndTime));
        }
        return rooms.size();
    }

    boolean checkIn(ArrayList<Room> rooms, Customer customer) {
        for (Room room : rooms) {
            if (room.checkIn(customer)) {
                return true;
            }
        }
        return false;
    }
}

class Room {
    int lastEndTime = 0;

    boolean checkIn(Customer customer) {
        if (lastEndTime <= customer.startTime) {
            changeLastEndTime(customer.endTime);
            return true;
        }
        return false;
    }

    void changeLastEndTime(int endTime) {
        lastEndTime = endTime + 600;
    }
}

class Customer {
    // 0 ~ 86,340
    int startTime;
    int endTime;

    public Customer(String startTime, String endTime) {
        this.startTime = stringTimeToIntTime(startTime);
        this.endTime = stringTimeToIntTime(endTime);
    }

    int stringTimeToIntTime(String time) {
        String[] split = time.split(":");
        return (Integer.parseInt(split[0]) * 60 * 60) + (Integer.parseInt(split[1]) * 60);
    }
}