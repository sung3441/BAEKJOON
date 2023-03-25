import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(br.readLine());

        while (n-- > 0) {
            BigInteger bigInteger = new BigInteger(br.readLine());
            sb.append(bigInteger.isProbablePrime(10)
                    ? bigInteger
                    : bigInteger.nextProbablePrime()).append("\n");
        }
        System.out.println(sb);
    }
}