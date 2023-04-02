import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        System.out.print(radix(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
    }

    static String radix(int num, int n) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (num % n < 10) {
                sb.append((char) (num % n + '0'));
            } else {
                sb.append((char) (num % n - 10 + 'A'));
            }
            num /= n;
        }
        return sb.reverse().toString();
    }
}