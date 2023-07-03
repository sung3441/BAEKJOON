class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        boolean flag = true;
        
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                flag = true;
                continue;
            }
            if (c < 65) {
                flag = false;
                continue;
            }
            if (flag) {
                chars[i] = (char) (c - 32);
                flag = false;
            }
        }
        
        return String.valueOf(chars);
    }
}