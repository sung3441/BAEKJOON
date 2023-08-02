import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack();
        StringTokenizer st;
        
        while (n-- > 0) {
            char[] arr = br.readLine().toCharArray();
            stack.clear();
            
            for (char c : arr) {
                if (stack.isEmpty() && c == ')') {
                    stack.push(c);
                    break;
                }

                if (!stack.isEmpty() && c == ')' && stack.peek() == '(') {
                    stack.pop();
                    continue;
                }
                stack.push(c);
            }
            sb.append(stack.isEmpty() ? "YES" : "NO").append("\n");
        }
        
        System.out.print(sb);
    }
}