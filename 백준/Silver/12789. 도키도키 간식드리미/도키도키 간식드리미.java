import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int next = 1;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == next) {
                next++;
                continue;
            }
            
            while (!stack.isEmpty()) {
                if (stack.peek() == next) {
                    stack.pop();
                    next++;
                    continue;
                }
                break;
            }
            
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            if (stack.peek() == next) {
                next++;
                stack.pop();
                continue;
            }
            break;
        }
        
        System.out.print(stack.isEmpty() ? "Nice" : "Sad");
    }
}