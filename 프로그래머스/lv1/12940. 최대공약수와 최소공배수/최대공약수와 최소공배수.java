class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = n > m ? n : m;
        int small = m > n ? n : m;
             
        answer[0] = gcd(big, small);
        answer[1] = lcm(big, small, answer[0]);
        return answer;
    }
    
    int gcd(int big, int small) {
        int remain = big % small;
        if (remain == 0) {
            return small;
        }
        return gcd(small, remain);
    }
    
    int lcm(int big, int small, int gcd) {
        return (big / gcd) * (small / gcd) * gcd;
    }
}