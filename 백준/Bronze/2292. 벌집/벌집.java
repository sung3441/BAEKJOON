import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long i = 1;
        long j = 1;
        if (n == i) System.out.println(n);
        while (n != 1) {
            long end = (6 * j) + 1;
            long start = end - ((6 * i) - 1);
            if (n >= start && n <= end) {
                System.out.println(i + 1);
                break;
            }
            j += 1 + i++;
        }
    }
}