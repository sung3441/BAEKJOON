import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 1;
        int count = 1;
        int sum = 2;
        while (true) {
            if (count <= n && n <= count + sum) {
                System.out.println(result);
                break;
            }
            result++;
            count += (sum + 1);
            sum += 2;
        }
    }
}