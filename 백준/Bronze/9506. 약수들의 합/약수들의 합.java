import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num = br.readLine();

        while (!"-1".equals(num)) {
            sb.append(solution(Integer.parseInt(num)));
            num = br.readLine();
        }
        System.out.println(sb);
    }

    static String solution(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        int[] arr = IntStream.range(1, num).filter(i -> num % i == 0).toArray();
        if (num != Arrays.stream(arr).sum()) {
            return sb.append(" is NOT perfect.\n").toString();
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(i == 0 ? " = " : " + ");
            sb.append(arr[i]);
        }
        return sb.append("\n").toString();
    }
}