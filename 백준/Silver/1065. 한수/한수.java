import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n < 100) {
            System.out.print(n);
            return;
        }
        int count = 99;
        for (int i = 100; i <= n; i++) {
            if (is한수(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean is한수(int num) {
        // num이 1234일 때 before: 3, diff: 1, num: 12 으로 세팅
        int before = num / 10 % 10;
        int diff = (num % 10) - before;
        num /= 100;

        while (num != 0) {
            if (before - (num % 10) != diff) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}