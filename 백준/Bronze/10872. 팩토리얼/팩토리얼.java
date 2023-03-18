import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(solution(n));
    }
    
    static int solution(int n) {
        if (n < 1) return 1;
        return factorial(n, 1, 1);
    }
    
    static int factorial(int n, int num, int count) {
        num *= count;
        return n == count ? num : factorial(n, num, ++count);
    }
}