import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack();
        int sum = 0;
        
        while (n-- > 0) {
            String num = br.readLine();
            if ('0' == num.charAt(0)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            sum += Integer.parseInt(stack.pop());
        }
        
        System.out.print(sum);
    }
}