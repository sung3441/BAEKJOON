import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        array = Arrays.stream(array).sorted().toArray();

        int gcd = array[1] - array[0];
        for (int i = 1; i < array.length - 1; i++) {
            int minus = array[i] - array[i - 1];
            gcd = gcd(Math.max(gcd, minus), Math.min(gcd, minus));
        }

        System.out.println(((array[n - 1] - array[0]) / gcd) - n + 1);
    }

    static int gcd(int big, int small) {
        int remain = big % small;
        if (remain == 0) {
            return small;
        }
        return gcd(small, remain);
    }
}