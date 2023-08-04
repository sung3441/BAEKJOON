import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = -999999999;
        int[] arr = new int[n + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
            if (i >= k) {
                max = Math.max(max, arr[i] - arr[i - k]);
            }
        }

        System.out.print(max);
    }
}
