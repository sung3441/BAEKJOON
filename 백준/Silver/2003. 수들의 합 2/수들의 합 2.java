import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int start = 0;
        int end = 0;
        int count = 0;
        int sum = 0;
        
        while (start < n) {
            if (sum > m || end == n) {
                sum -= arr[start++];
            } else {
                sum += arr[end++];
            }
            
            if (sum == m) {
                count++;
            }
        }
        System.out.print(count);
    }
}