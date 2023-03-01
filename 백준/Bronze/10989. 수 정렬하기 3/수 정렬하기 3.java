import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] numArr = new int[10_000];

        for (int i = 0; i < n; i++) {
            numArr[Integer.parseInt(br.readLine()) - 1]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            while (numArr[i]-- > 0) {
                sb.append(i + 1).append("\n");
            }
        }
        System.out.println(sb);
    }
}