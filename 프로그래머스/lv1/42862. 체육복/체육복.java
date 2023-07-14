import java.util.HashMap;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        HashMap<Integer, Integer> map = new HashMap();
        int answer = n - lost.length;
        
        for (int i = 0; i < lost.length; i++) {
            map.put(lost[i], -1);
        }
        
        for (int i = 0; i < reserve.length; i++) {
            if (map.containsKey(reserve[i])) {
                map.put(reserve[i], 0);
                answer++;
                continue;
            }
            map.put(reserve[i], 1);
        }
        
        for (int i = 1; i <= n; i++) {
            if (map.getOrDefault(i, 0) == -1) {
                if (map.getOrDefault(i - 1, 0) == 1) {
                    map.put(i - 1, 0);
                    answer++;
                } else if (map.getOrDefault(i + 1, 0) == 1) {
                    map.put(i + 1, 0);
                    answer++;
                }
            }   
        }
        
        return answer;
    }
}