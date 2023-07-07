class Solution {
    public int solution(String s) {
        int answer = 0;
        
        while (!"".equals(s)) {
            char c = s.charAt(0);
            int sameCount = 1;
            int diffCount = 0;
            for (int i = 1; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                    sameCount++;
                } else {
                    diffCount++;
                }
                
                if (sameCount == diffCount) {
                    answer++;
                    s = s.substring(i + 1);
                    break;
                }
            }
            if (sameCount != diffCount) {
				answer++;
                break;
            }
        }
        
        return answer;
    }
}