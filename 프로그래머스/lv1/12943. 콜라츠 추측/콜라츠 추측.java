class Solution {
    public int solution(long num) {
        int count = 0;
        while (num != 1) {
            num = cal(num);
            if (++count == 500) {
                return -1;
            }
        }
        
        return count;
    }
    
    public long cal(long num) {
        if (num % 2 == 0) {
            return num / 2;
        }
        return (num * 3) + 1;
    }
}