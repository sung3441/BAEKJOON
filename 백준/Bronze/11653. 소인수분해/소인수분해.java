import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i < n / 2; i++) {
            while (n % i == 0) {
                n /= i;
                System.out.println(i);
            }
        }
        if (n != 1) {
            System.out.print(n);
        }
    }
}