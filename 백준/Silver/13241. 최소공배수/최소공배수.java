import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);

        if (b > a) {
            long temp = a;
            a = b;
            b = temp;
        }

        long gcd = eucd(a, b);
        long lcm = (a / gcd) * (b / gcd) * gcd;
        System.out.print(lcm);
    }

    static long eucd(long big, long small) {
        long remain = big % small;
        if (remain == 0) {
            return small;
        }
        return eucd(small, remain);
    }
}