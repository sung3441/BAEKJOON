import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack();
        int answer = 0;
        
        for(int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;
            for(int j = 0; j < board.length; j++) {
                int doll = board[j][move];
                if(board[j][move] != 0){
                    board[j][move] = 0;
                    if (!stack.empty() && stack.peek() == doll) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(doll);
                    }
                    break;
                }   
            }
        }
        
        return answer;
    }
}