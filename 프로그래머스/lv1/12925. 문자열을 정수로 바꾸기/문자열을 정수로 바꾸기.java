class Solution {
    public int solution(String s) {
        return Integer.parseInt(s.replaceAll("[+-]", "")) * (s.contains("-") ? -1 : 1);
    }
}