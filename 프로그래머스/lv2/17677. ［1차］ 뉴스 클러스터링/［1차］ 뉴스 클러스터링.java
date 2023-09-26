import java.util.ArrayList;
import java.util.HashSet;

class Solution {
     public int solution(String str1, String str2) {
        ArrayList<String> list1 = getList(str1);
        ArrayList<String> list2 = getList(str2);
        ArrayList<String> mergeLIst = new ArrayList<>(list1);
        mergeLIst.addAll(list2);
        HashSet<String> mergeSet = new HashSet<>(mergeLIst);

        int unionCount = 0;
        int intersectionCount = 0;

        for (String s : mergeSet) {
            long count1 = list1.stream().filter(s::equals).count();
            long count2 = list2.stream().filter(s::equals).count();
            
            unionCount += (int) Math.max(count1, count2);
            
            if (count1 > 0 && count2 > 0) {
                intersectionCount += (int) Math.min(count1, count2);
            }
        }

        return (int) ((unionCount > 0 ? (double) intersectionCount / unionCount : 1) * 65536);
    }

    ArrayList<String> getList(String str) {
        ArrayList<String> list = new ArrayList<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            String sub = str.substring(i, i + 2);
            char ch1 = sub.charAt(0), ch2 = sub.charAt(1);
            if (97 <= ch1 && ch1 <= 122 && 97 <= ch2 && ch2 <= 122) {
                list.add(sub);
            }
        }
        return list;
    }
}