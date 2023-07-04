class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray(); 
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                continue;   
            }
            boolean isSmall = c > 'Z';
            c = (char) (c + n);
            
            if ((isSmall && c > 'z') || (!isSmall && c > 'Z')) {
                c = (char) (c - 26);
            }
            chars[i] = c;
        }
        return String.valueOf(chars);
    }
}