import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        
        permutation(arr, output, visited, 0, m);
        System.out.print(sb);
    }
    
    static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                if (i != 0) sb.append(" ");
                sb.append(output[i]);
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}