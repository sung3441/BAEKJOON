import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arr = new int[n];
        int[] sumArr = new int[n + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            sumArr[i + 1] =  sumArr[i] + arr[i];
            sum += sumArr[i + 1];
        }
        
        System.out.print(sum);
    }
}