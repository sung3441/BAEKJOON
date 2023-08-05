import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        
        int n = sc.nextInt();
        while (n-- > 0) {
            int command = sc.nextInt();
            if (command == 1) {
                stack.push(sc.nextInt());
            } else if (command == 2) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (command == 3) {
                sb.append(stack.size()).append("\n");
            } else if (command == 4) {
                 sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        System.out.print(sb);
    }
}