import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        int length = String.valueOf(n).length();
        int[] arr = new int[length];
        int cnt = 0;
        
        while (n > 0) {
            arr[cnt++] = (int) (n % 10);
            n /= 10;
        }
        Arrays.sort(arr);
        
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}