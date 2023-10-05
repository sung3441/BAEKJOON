import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String word = br.readLine();
            if (word.length() == 1) {
                word = word + word;
            }
            sb.append(word.charAt(0)).append(word.charAt(word.length() - 1)).append("\n");
        }
        System.out.println(sb);
    }
}