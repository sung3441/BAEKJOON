import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[5][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine().split("");
        }


        for (int i = 0; i < 15; i++) {
            for (String[] strings : arr) {
                if (strings.length > i) {
                    sb.append(strings[i]);
                }
            }
        }
        System.out.println(sb);
    }
}