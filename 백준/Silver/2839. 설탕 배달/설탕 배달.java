import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    static int solution(int n) {
        for (int i = n / 5; i >= 0; i--) {
            int diff = n - (5 * i);
            if (diff % 3 == 0) {
                return i + (diff / 3);
            }
        }
        return -1;
    }
}