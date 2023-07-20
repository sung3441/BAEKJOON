import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int sum = 0;
        int count = 0;
        int target = Integer.parseInt(split[1]);
        
        int[] coins = new int[n];
        
        for (int i = 0; i < n; i++) {
            coins[n - 1 - i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < n; i++) {
            int coin = coins[i];
            int remain = target / coin;
            if (remain == 0) {
                continue;
            }
            count += remain;
            target = (int) target % coin;
            if (target == 0) {
                break;
            }
        }
        
        System.out.print(count);
    }
}