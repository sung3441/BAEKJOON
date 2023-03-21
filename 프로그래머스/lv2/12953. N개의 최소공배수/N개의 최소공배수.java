import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int count = 1;
        while (true) {
            int num = max * count++;
            if (isLeastCommonMultiple(num, arr)) {
                return num;
            }
        }
    }
    
    static boolean isLeastCommonMultiple(int num, int[] arr) {
        for (int n : arr) {
            if (num % n != 0) {
                return false;
            }
        }
        return true;
    }
}