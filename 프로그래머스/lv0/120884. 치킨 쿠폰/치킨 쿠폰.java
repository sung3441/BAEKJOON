class Solution {
    public int solution(int chicken) {
        int result = 0;
        int coupon = chicken;
        while (coupon >= 10) {
            int serviceChicken = coupon / 10;
            coupon %= 10;
            coupon += serviceChicken;
            result += serviceChicken;
        }
        return result;
    }
}