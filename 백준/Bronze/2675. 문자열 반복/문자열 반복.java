import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken(); 
           
            for (int j = 0; j < s.length(); j++) {
                sb.append(Character.toString(s.charAt(j)).repeat(r));
            }
            System.out.println(sb);
        }
    }
}