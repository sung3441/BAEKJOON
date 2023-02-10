import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int result = 0;
        int[] arr = {3, 3, 3, 3, 3, 4, 3, 4};
        char[] alphas = new BufferedReader(new InputStreamReader(System.in))
                .readLine().toCharArray();
        for (char alpha : alphas) {
            int cnt = -1;
            for (int i = 65; i <= 87; i += arr[cnt]) {
                cnt++;
                if ((int) alpha >= i && (int) alpha <= i + arr[cnt] - 1) {
                    result += (cnt + 3);
                }
            }
        }
        System.out.println(result);
    }
}