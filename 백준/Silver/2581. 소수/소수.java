import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int sum = 0, min = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i = m; i <= n; i++) {
            if (i > 1 && isSosu(i)) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }
        System.out.print(sum == 0 ? "-1" : sum + "\n" + min);
    }

    static boolean isSosu(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}