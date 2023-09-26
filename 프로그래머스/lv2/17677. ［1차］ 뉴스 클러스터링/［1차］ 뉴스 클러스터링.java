import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
     public int solution(String str1, String str2) {
        ArrayList<String> list1 = getList(str1);
        ArrayList<String> list2 = getList(str2);
        Set<String> mergeSet = getMergeSet(list1, list2);

        int unionCount = 0;
        int intersectionCount = 0;
        boolean hasSameData = false;

        for (String s : mergeSet) {
            int count1 = countAndRemove(list1, s);
            int count2 = countAndRemove(list2, s);

            unionCount += Math.max(count1, count2);

            if (count1 > 0 && count2 > 0) {
                intersectionCount += Math.min(count1, count2);
            }
        }

        double jaccard = unionCount > 0 ? (double) intersectionCount / unionCount : 1;

        return (int) (jaccard * 65536);
    }

    int countAndRemove(List<String> list, String target) {
        int count = 0;
        for (String s : list) {
            if (target.equals(s)) {
                count++;
            }
        }
        remove(list, target, count);
        return count;
    }

    void remove(List<String> list, String target, int count) {
        while (count-- > 0) {
            list.remove(target);
        }
    }

    Set<String> getMergeSet(List<String> list1, List<String> list2) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return new HashSet<>(list);
    }

    ArrayList<String> getList(String str) {
        ArrayList<String> list = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            String substr = str.substring(i, i + 2);
            if (valid(substr)) {
                list.add(substr);
            }
        }
        return list;
    }

    boolean valid(String str) {
        for (char c : str.toCharArray()) {
            if (!(97 <= c && c <= 122)) {
                return false;
            }
        }
        return true;
    }
}