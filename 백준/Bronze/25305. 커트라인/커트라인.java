import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        
        int[] scores = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt).sorted().toArray();
        
        System.out.println(scores[n - k]);
    }
}