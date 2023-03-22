import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] numA = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] numB = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        long gcd = gcd(Math.max(numA[1], numB[1]), Math.min(numA[1], numB[1]));
        long lcm = (numA[1] / gcd) * (numB[1] / gcd) * gcd;
        long molecule = numA[0] * (lcm / numA[1]) + numB[0] * (lcm / numB[1]);

        gcd = gcd(Math.max(molecule, lcm), Math.min(molecule, lcm));
        System.out.print(sb.append(molecule / gcd).append(" ").append(lcm / gcd));
    }

    static long gcd(long big, long small) {
        long remain = big % small;
        if (remain == 0) {
            return small;
        }
        return gcd(small, remain);
    }
}