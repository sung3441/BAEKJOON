class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int n = isDivisorCountEven(i) ? 1 : -1;
            answer += i * n;
        }
        
        return answer;
    }
    
    boolean isDivisorCountEven(int num) {
        
        int n = 0;
        int count = 0;
        
        while (++n <= num) {
            if (num % n == 0) {
                count++;
            }
        }
        return count % 2 == 0;
    }
}