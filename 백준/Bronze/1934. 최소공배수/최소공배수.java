import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int result = solution(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            System.out.println(result);
        }
    }
    
    static int solution(int a, int b) {
        int max = a > b ? a : b;
        int min = a + b - max;
        
        for (int i = 1; i <= min; i++) {
            int num = max * i;
            if (num % min == 0) {
                return num;
            }
        }
        return -1;
    }
}