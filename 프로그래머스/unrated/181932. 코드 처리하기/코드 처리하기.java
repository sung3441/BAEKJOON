class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            if (i % 2 == 0 && mode == 0) {                
                sb.append(c);
            }
            
            if (i % 2 == 1 && mode == 1) {                
                sb.append(c);
            }
        }
        
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}