import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] legend = new int[k];
        
        for (int i = 0; i < score.length; i++) {
            int s = score[i];
            
            if (s > legend[0]) {
                legend[0] = s;
                Arrays.sort(legend);
            }
            answer[i] = i < k ? legend[k - 1 - i] : legend[0];
        }
        return answer;
    }
}