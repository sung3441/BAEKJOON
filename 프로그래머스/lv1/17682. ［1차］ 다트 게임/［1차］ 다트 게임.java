class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int gameCount = 0;
        int indexCount = 0;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (indexCount == 0 && '0' <= c && '9' >= c) {
                scores[gameCount] = (int) c - '0';
                indexCount++;
                continue;
            }
            
            if (indexCount == 1) {
                if (c == '0') {
                    scores[gameCount] = 10;
                    continue;
                }
                int pow = c == 'S' ? 1 : c == 'D' ? 2 : 3;
                scores[gameCount] = (int) Math.pow(scores[gameCount], pow);
                if (i + 1 < dartResult.length()) {
                    if (dartResult.charAt(i + 1) == '*') {
                        scores[gameCount] *= 2;
                        if (gameCount > 0) {
                            scores[gameCount - 1] *= 2;
                        }
                    }
                        
                    if (dartResult.charAt(i + 1) == '#') {
                        scores[gameCount] *= -1;
                    }
                }
                indexCount = 0;
                gameCount++;
            }
            System.out.println(scores[0]);
            System.out.println(scores[1]);
            System.out.println(scores[2]);
        }
          
        return scores[0] + scores[1] + scores[2];
    }
}