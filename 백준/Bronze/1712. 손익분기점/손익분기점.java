import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int fix = Integer.parseInt(st.nextToken());
        int var = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int result = var >= price ? -1 : (fix / (price - var)) + 1;
        System.out.print(result);
    }
}