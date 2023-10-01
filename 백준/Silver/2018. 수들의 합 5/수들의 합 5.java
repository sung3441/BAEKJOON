import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sumArr = new int[n + 1];
        for (int i = 1; i < sumArr.length; i++) {
            sumArr[i] += sumArr[i - 1] + i;
        }
        
        int startIndex = 0;
        int endIndex = 0;
        int count = 1;
        
        while (endIndex != n) {
            int sum = sumArr[endIndex] - sumArr[startIndex];
            if (sum == n) {
                count++;
                endIndex++;
            } else if (sum > n) {
                startIndex++;
            } else {
                endIndex++;
            }
        }
        
        System.out.println(count);
    }
}