class Solution {
    boolean solution(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            count += c == '(' ? 1 : -1;
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}