import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] apt;

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            apt = new int[k + 1][n];

            for (int col = 0; col < n; col++) {
                apt[0][col] = col + 1; 
            }
            for (int row = 1; row < k + 1; row++) {
                for (int col = 0; col < n; col++) {
                    int sum = 0;
                    for (int j = 0; j < col + 1; j++) {
                        sum += apt[row - 1][j];
                    }
                    apt[row][col] = sum;
                }
            }
            System.out.println(apt[k][n - 1]);
        }
    }
}