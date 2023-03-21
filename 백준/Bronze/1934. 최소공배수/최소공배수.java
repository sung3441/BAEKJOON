import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            sb.append(solution(Integer.parseInt(split[0]), Integer.parseInt(split[1]))).append("\n");
        }
        System.out.print(sb);
    }
    
    static int solution(int a, int b) {
        int max = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        return (a * b) / max;
    }
}