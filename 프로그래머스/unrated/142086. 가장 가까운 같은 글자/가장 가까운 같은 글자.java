import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("");
        int[] answer = new int[s.length()];
        HashMap<String, Integer> hm = new HashMap(); // index
        
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];              // 5 - 3 = 2
            answer[i] = hm.containsKey(key) ? i - hm.get(key) : -1;
            hm.put(key, i);
        }       
        return answer;
    }
}