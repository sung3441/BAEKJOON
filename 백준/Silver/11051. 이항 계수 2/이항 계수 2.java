import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);
        int[][] arr = new int[N + 1][N + 1];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) { // 좌우 끝 값은 무조건 1
                    arr[i][j] = 1;
                    continue;
                }
                arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % 10_007;
            }
        }
        System.out.println(arr[N][K]);
    }
}