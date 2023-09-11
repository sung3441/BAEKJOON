import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        
        if (length == 1) {
            return 0;
        }
        
        while (length-- > 0) {
            if (validCheck(s)) {
                answer++;
            }
            s = shift(s);
        }
        return answer;
    }
    
    String shift(String word) {
        return word.substring(1, word.length()) + word.substring(0, 1);
    }
    
    boolean validCheck(String word) {
        Stack<Character> stack = new Stack();
        char[] chars = word.toCharArray();
        
        for (char c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            
            char peek = stack.peek();
            stack.push(c);
            if (peek == '[' || peek == '(' || peek == '{') {
                if (match(peek, c)) {
                    stack.pop();
                    stack.pop();
                }
                continue;
            }
            return false;
        }
        return stack.isEmpty();
    }
    
    boolean match (char open, char close) {
        char target = open == '[' ? ']' : open == '{' ? '}' : open == '(' ? ')' : '!';
        return close == target;
    }
}