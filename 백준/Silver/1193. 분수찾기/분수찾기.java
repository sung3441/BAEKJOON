import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int cnt = 0;
        int sum = 0;
        while (true) {
            sum += ++ cnt;
            if (n >= sum - (cnt - 1) && n <= sum) {
                break;
            }
        }
        long i = n - (sum - cnt);
        String result = cnt % 2 == 0 ? i + "/" + (cnt + 1 - i) : (cnt + 1 - i) + "/" + i;
        System.out.print(result);
    }
}