import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] gaps = new int[n - 1];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
            
            if (i > 0) {
                gaps[i - 1] = array[i] - array[i - 1];
            }
        }
        
        for (int i = 0; i <= gaps.length - 2; i++) {
            gaps[i + 1] = gcd(gaps[i], gaps[i + 1]);
        }
        
        int gap = gaps[gaps.length - 1];

        System.out.println((array[n - 1] - array[0]) / gap - (n - 1));
    }

    static int gcd(int big, int small) {
        while (small > 0) {
            int temp = big;
            big = small;
            small = temp % small;
        }
        return big;
    }
}