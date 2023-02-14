import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        int j = 1;
        if (n == i) System.out.println(n);
        while (n != 1) {
            int end = (6 * j) + 1;
            int start = end - ((6 * i) - 1);
            if (n >= start && n <= end) {
                System.out.println(i + 1);
                break;
            }
            j += 1 + i++;
        }
    }
}