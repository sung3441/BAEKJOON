class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        String color = board[h][w];
        int[][] arr = {
            {-1, 0}, // 위
            {1, 0},  // 아래
            {0, -1}, // 좌
            {0, 1}   // 우
        };
        
        for (int[] ar : arr) {
            int newH = h + ar[0];
            int newW = w + ar[1];
            if (invalidPosition(newH, newW, n) && color.equals(board[newH][newW])) {
                answer++;
            }
        }
        
        return answer;
    }
    
    boolean invalidPosition(int h, int w, int length) {
        return h > -1 && h < length && w > -1 && w < length;
    }
}