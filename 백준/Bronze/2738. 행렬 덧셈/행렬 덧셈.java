import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        for (int n = 0; n < 3; n++) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (n == 2) {
                        sb.append(arr[i][j]).append(" ");
                        continue;
                    }
                    arr[i][j] += sc.nextInt();
                }
            }
            if (n == 2) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}