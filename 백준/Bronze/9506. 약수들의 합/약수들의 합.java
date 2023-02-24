import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        while (!"-1".equals(num)) {
            System.out.println(solution(Integer.parseInt(num)));
            num = br.readLine();
        }
    }

    static StringBuilder solution(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int[] arr = IntStream.range(1, num).filter(i -> num % i == 0).toArray();
        if (num != Arrays.stream(arr).sum()) {
            return sb.append(" is NOT perfect.");
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(i == 0 ? " = " : " + ");
            sb.append(arr[i]);
        }
        return sb;
    }
}