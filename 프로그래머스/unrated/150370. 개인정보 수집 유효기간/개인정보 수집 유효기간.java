import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<>();
        Terms.saveTerms(terms);

        for (int i = 0; i < privacies.length; i++) {
            String createdDate = privacies[i].split(" ")[0];
            String termsName = privacies[i].split(" ")[1];
            Terms term = Terms.termsStore.get(termsName);
            if (term.isExpired(createdDate, today)) {
                result.add(i + 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

class Terms {
    static HashMap<String, Terms> termsStore = new HashMap<>();

    String name;
    int expiredMonth;

    public Terms(String name, int expiredMonth) {
        this.name = name;
        this.expiredMonth = expiredMonth;
    }

    boolean isExpired(String createdDate, String today) {
        Date expiredDate = new CustomDate(createdDate).calDate(expiredMonth);
        Date todayDate = CustomDate.toDate(today);
        return todayDate.compareTo(expiredDate) > 0;
    }

    static void saveTerms(String[] termsArr) {
        for (String term : termsArr) {
            String name = term.split(" ")[0];
            int expiredMonth = Integer.parseInt(term.split(" ")[1]);
            Terms terms = new Terms(name, expiredMonth);
            termsStore.put(terms.name, terms);
        }
    }
}

class CustomDate {
    int yy;
    int mm;
    int dd;

    static Date toDate(String date) {
        String[] split = date.split("\\.");
        return new Date(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
    }

    public CustomDate(String date) {
        String[] split = date.split("\\.");
        yy = Integer.parseInt(split[0]);
        mm = Integer.parseInt(split[1]);
        dd = Integer.parseInt(split[2]);
    }

    Date calDate(int month) {
        if (dd == 1) {
            dd = 29;
            month--;
        }
        dd--;
        if (month / 12 > 0) {
            yy += month / 12;
            month %= 12;
        }
        if (mm + month > 12) {
            yy++;
            mm += month - 12;
            month = 0;
        }
        mm += month;
        return new Date(yy, mm, dd);
    }
}