import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(solution(n));
    }

    static int solution(int n) {
        int nLength = (int) Math.log10(n) + 1;
        int start = n - (nLength * 9);
        if (start < 0) {
            start = 0;
        }

        for (int i = start; i < n; i++) {
            if (isConstructor(i, n)) {
                return i;
            }
        }
        return 0;
    }

    static boolean isConstructor(int expect, int actual) {
        int sum = expect;
        while (expect != 0) {
            sum += expect % 10;
            expect /= 10;
        }
        return sum == actual;
    }
}