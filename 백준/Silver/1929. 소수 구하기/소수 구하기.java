import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[n + 1];
        IntStream.range(2, arr.length).forEach(i -> arr[i] = true);

        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * 2; j < arr.length; j += i) {
                    arr[j] = false;
                }
            }
        }
        IntStream.range(m, n + 1).filter(i -> arr[i]).forEach(System.out::println);
    }
}