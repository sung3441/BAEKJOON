import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("");
        int[] answer = new int[s.length()];
        HashMap<String, Integer> hm = new HashMap();
        
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            answer[i] = hm.containsKey(key) ? i - hm.get(key) : -1;
            hm.put(key, i);
        }       
        return answer;
    }
}