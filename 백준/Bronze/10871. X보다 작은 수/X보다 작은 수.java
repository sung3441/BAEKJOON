import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int x = Integer.parseInt(strArr[1]);
        
        int[] arr = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) {
                sb.append(arr[i] + " ");
            }
        }
        System.out.print(sb.toString());
    }
}