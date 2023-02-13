import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long fix = Long.parseLong(st.nextToken());
        long var = Long.parseLong(st.nextToken());
        long price = Long.parseLong(st.nextToken());

        long result = var >= price ? -1 : (fix / (price - var)) + 1;
        System.out.print(result);
    }
}