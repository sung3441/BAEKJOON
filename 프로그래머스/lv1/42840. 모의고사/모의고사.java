import java.util.Arrays;
  
class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            int ans = answers[i];
            if(ans == person1[i%person1.length]) score1++;
            if(ans == person2[i%person2.length]) score2++;
            if(ans == person3[i%person3.length]) score3++;
            
        }
        
        int[] scores = {score1, score2, score3};
        int max = 0;
        for(int score : scores){
            if(score > max) max = score;
        }
        
        int maxCnt = 0;
        for(int i = 1; i <= scores.length; i++){
            if(scores[i-1] == max) {
                maxCnt++;
            }
        }
        
        int[] answer = new int[maxCnt];
        
        int index = 0;
        for(int i = 1; i <= scores.length; i++){
            if(scores[i-1] == max) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}