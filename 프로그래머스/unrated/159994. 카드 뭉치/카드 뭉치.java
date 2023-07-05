class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int count1 = 0;
        int count2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            String word = goal[i];
            if (count1 < cards1.length && word.equals(cards1[count1])) {
                count1++;
            }
            
            if (count2 < cards2.length && word.equals(cards2[count2])) {
                count2++;
            }
        }
        
        return goal.length == (count1 + count2) ? "Yes" : "No";
    }
}