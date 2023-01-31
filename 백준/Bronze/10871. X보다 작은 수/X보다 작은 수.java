import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (x > num) {
                sb.append(num + " ");
            }
        }
        System.out.print(sb.toString());
    }
}