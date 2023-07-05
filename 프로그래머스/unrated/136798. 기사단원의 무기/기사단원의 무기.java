class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int weaponPower = getDivisorCount(i);
            if (weaponPower > limit) {
                weaponPower = power;
            }
            answer += weaponPower;
        }
        return answer;
    }
    
    int getDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i * i == n) {
                count++;
            } else if (n % i == 0) {
                count += 2;
            }
        } 
        return count;
    }
}