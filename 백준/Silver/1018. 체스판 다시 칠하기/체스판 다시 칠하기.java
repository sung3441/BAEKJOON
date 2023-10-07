import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        String[][] board = new String[n][m];
        int result = 2_501;

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().split("");
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int solution = solution(i, j, board);
                if (solution < result) {
                    result = solution;
                }
            }
        }
        System.out.println(result);
    }

    static int solution(int n, int m, String[][] board) {
        String startColor = board[n][m];
        int recoverCountA = 0;
        int recoverCountB = 0;
        for (int i = n; i < n + 8; i++) {
            for (int j = m; j < m + 8; j++) {
                String color = board[i][j];
                if ((j - m + 1) % 2 == 0 ? startColor.equals(color) : !startColor.equals(color)) {
                    recoverCountA++;
                    continue;
                }
                recoverCountB++;
            }
            startColor = startColor.equals("B") ? "W" : "B";
        }
        return recoverCountA < recoverCountB ? recoverCountA : recoverCountB;
    }
}
