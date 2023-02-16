import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] apt;

        for (int y = 0; y < t; y++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            apt = new int[k + 1][n];

            for (int i = 0; i < k + 1; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0) {
                        apt[i][j] = j + 1;
                        continue;
                    }
                    int sum = 0;
                    for (int u = 0; u < j + 1; u++) {
                        sum += apt[i - 1][u];
                    }
                    apt[i][j] = sum;
                }
            }
            System.out.println(apt[k][n - 1]);
        }
    }
}