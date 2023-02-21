import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[n + 1];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}