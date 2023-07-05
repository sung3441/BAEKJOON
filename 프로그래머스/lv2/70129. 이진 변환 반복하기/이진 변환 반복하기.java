class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!"1".equals(s)) {
            int oldLength = s.length();
            int newLength = s.replaceAll("0", "").length();
            
            answer[1] += oldLength - newLength;
            answer[0]++;
            
            s = Integer.toString(newLength, 2);
        }
        return answer;
    }
}