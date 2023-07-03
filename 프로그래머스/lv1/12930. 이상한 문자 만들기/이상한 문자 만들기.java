class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                count = 0;
                continue;
            }
            if (count % 2 == 0) {
                chars[i] = (char) (c - 32);
            }
            count++;
        }
        return String.valueOf(chars);
    }
}