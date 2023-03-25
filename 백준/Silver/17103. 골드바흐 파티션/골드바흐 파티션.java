import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            sb.append(getSosuCount(Integer.parseInt(br.readLine()))).append("\n");
        }
        System.out.println(sb);
    }

    static int getSosuCount(int num) {
        boolean[] arr = new boolean[num];
        arr[0] = true;
        arr[1] = true;
        int count = 0;

        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i <= (num / 2); i++) {
            if (!arr[i] && !arr[num - i]) {
                count++;
            }
        }
        return count;
    }
}