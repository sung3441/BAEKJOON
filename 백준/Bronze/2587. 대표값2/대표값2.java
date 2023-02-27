import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println((int) Arrays.stream(arr).average().getAsDouble());
        System.out.println(Arrays.stream(arr).sorted().toArray()[2]);
    }
}