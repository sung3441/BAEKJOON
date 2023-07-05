import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        nums = Arrays.stream(nums).distinct().toArray();
        return nums.length >= count ? count : nums.length;
    }
}