import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] arr = new boolean[n];
        
        for (int sec : section) {
            arr[sec - 1] = true;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                for (int j = i; j < i + m && j < arr.length; j++) {
                    arr[j] = false;    
                }
                answer++;
            }
        }
        return answer;
    }
}