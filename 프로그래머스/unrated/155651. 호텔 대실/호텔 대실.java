import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[][] book_time) {
        ArrayList<Room> rooms = new ArrayList<>();
        List<Customer> customers = Arrays.stream(book_time)
                .map(strings -> new Customer(strings[0], strings[1])).collect(Collectors.toList());

        customers.sort(Comparator.comparingInt(o -> o.startTime));
        for (Customer customer : customers) {
            if (!checkIn(rooms, customer)) {
                Room newRoom = new Room(customer);
                rooms.add(newRoom);
            }
            rooms.sort(Comparator.comparingInt(o -> o.currentEndTime));
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
    HashSet<Customer> customers = new HashSet<>();
    int currentEndTime = 0;

    public Room() {
    }

    public Room(Customer customer) {
        addCustomer(customer);
    }

    boolean isEmpty(Customer newCustomer) {
        for (Customer oldCustomer : customers) {
            if (oldCustomer.overlapTime(newCustomer.startTime, newCustomer.endTime)) {
                return false;
            }
        }
        return true;
    }

    boolean checkIn(Customer customer) {
        if (isEmpty(customer)) {
            addCustomer(customer);
            return true;
        }
        return false;
    }

    void addCustomer(Customer customer) {
        this.customers.add(customer);
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

    boolean overlapTime(int newStartTime, int newEndTime) {
        return (startTime < newStartTime && (endTime + 600) > newStartTime)
                || (startTime < newEndTime && (endTime + 600) > newEndTime);
    }
}