import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<String, Integer> termsStore = new HashMap<>();

        for (String term : terms) {
            termsStore.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String createdDate = privacies[i].split(" ")[0];
            String termsName = privacies[i].split(" ")[1];
            if (isExpired(createdDate, today, termsStore.get(termsName))) {
                result.add(i + 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    static boolean isExpired(String createdDate, String today, int expiredMonth) {
        Date todayDate = toDate(today);
        Date expiredDate = calDate(createdDate, expiredMonth);
        return todayDate.compareTo(expiredDate) > 0;
    }

    static Date calDate(String createDate, int expiredMonth) {
        String[] split = createDate.split("\\.");
        int yy = Integer.parseInt(split[0]);
        int mm = Integer.parseInt(split[1]);
        int dd = Integer.parseInt(split[2]);

        if (dd == 1) {
            dd = 29;
            expiredMonth--;
        }
        dd--;
        if (expiredMonth / 12 > 0) {
            yy += expiredMonth / 12;
            expiredMonth %= 12;
        }
        if (mm + expiredMonth > 12) {
            yy++;
            mm += expiredMonth - 12;
            expiredMonth = 0;
        }
        mm += expiredMonth;
        return new Date(yy, mm, dd);
    }

    static Date toDate(String date) {
        String[] arr = date.split("\\.");
        return new Date(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }
}