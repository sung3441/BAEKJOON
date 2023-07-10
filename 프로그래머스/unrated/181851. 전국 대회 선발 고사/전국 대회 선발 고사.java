import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int count = 0;
        int[] arr = new int[3];
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        
        for (int i = 1; i <= rank.length; i++) {
            if (map.containsKey(i)) {
                arr[count++] = map.get(i);
                if (count > 2) {
                    break;
                }
            }
        }
        return (arr[0] * 10000) + (arr[1] * 100) + arr[2];
    }
}