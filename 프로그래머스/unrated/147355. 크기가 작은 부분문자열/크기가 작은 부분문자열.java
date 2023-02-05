class Solution {
    public int solution(String t, String p) {
        int result = 0;
        int len = p.length();
        long num = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - len; i++) {
            if (num >= Long.parseLong(t.substring(i, i + len))) {
                result++;
            }
        }
        return result;
    }
}