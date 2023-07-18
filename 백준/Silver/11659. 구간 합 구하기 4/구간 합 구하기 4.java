import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().split(" ")[1]);

        int[] numArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[numArr.length + 1];
        
        for (int i = 0; i < numArr.length; i++) {
            arr[i + 1] = arr[i] + numArr[i];
        }
        
        while (n-- > 0) {
            String[] scope = br.readLine().split(" ");
            int start = Integer.parseInt(scope[0]);
            int end = Integer.parseInt(scope[1]);
            System.out.println(arr[end] - arr[start - 1]);
        }
    }
}