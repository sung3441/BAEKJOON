import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        Integer[] arr = map.values()
                .stream()
                .sorted((a, b) -> b - a)
                .toArray(Integer[]::new);
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            answer++;
            sum += arr[i];
            if (sum >= k) {
                break;
            }
        }
        
        return answer;
    }
}