import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int result = 0;
        int[] arr = {3, 3, 3, 3, 3, 4, 3, 4};
        char[] alphas = new BufferedReader(new InputStreamReader(System.in))
                .readLine().toCharArray();
        for (char alpha : alphas) {
            for (int cnt = 0, i = 65; i <= 87; i += arr[cnt++]) {
                if (alpha >= i && alpha <= i + arr[cnt] - 1) {
                    result += (cnt + 3);
                }
            }
        }
        System.out.println(result);
    }
}
