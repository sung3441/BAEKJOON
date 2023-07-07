import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[][] arr = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int[] score = {3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> map = new HashMap();
        
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            if (choices[i] == 4) {
                continue;
            }
            char target = choices[i] > 4 ? s.charAt(1) : s.charAt(0);
            map.put(target, map.getOrDefault(target, 0) + score[choices[i] - 1]);
        }
        
        for (char[] a : arr) {
            answer += map.getOrDefault(a[0], 0) - map.getOrDefault(a[1], 0) > -1 ? a[0] : a[1];
        }
        
        return answer;
    }
}