import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 0;
        while (true) {
            sum += ++ cnt;
            if (n >= sum - (cnt - 1) && n <= sum) {
                break;
            }
        }
        int i = n - (sum - cnt);
        int j = cnt + 1 - i;
        String result = cnt % 2 == 0 ? i + "/" + j : j + "/" + i;
        System.out.print(result);
    }
}