import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    static Stack<String> stack = new Stack();
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            String number = st.hasMoreTokens() ? st.nextToken() : null;
            
            command(command, number);
        }
        
        System.out.print(sb);
    }
    
    static void command(String command, String number) {
        if ("push".equals(command)) {
            stack.push(number);
        } else if ("pop".equals(command)) {
            sb.append(stack.empty() ? -1 : stack.pop()).append("\n");
        } else if ("size".equals(command)) {
            sb.append(stack.size()).append("\n");
        } else if ("empty".equals(command)) {
            sb.append(stack.empty() ? 1 : 0).append("\n");
        } else if ("top".equals(command)) {
            sb.append(stack.empty() ? -1 : stack.peek()).append("\n");
        }
    }
}