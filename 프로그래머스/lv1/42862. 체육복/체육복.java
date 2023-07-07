import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] arr = new int[n + 2];
        
        for (int i : lost) arr[i]--;
        for (int i : reserve) arr[i]++;
        
        for (int i = 1; i <= n; i++) {
            if (arr[i] == -1) {
                if (arr[i - 1] == 1) {
                    arr[i]++;
                    arr[i - 1]--;
                } else if (arr[i + 1] == 1) {
                    arr[i]++;
                    arr[i + 1]--;
                } else {
                    answer--;
                }
            }
        }
        return answer;
    }
}