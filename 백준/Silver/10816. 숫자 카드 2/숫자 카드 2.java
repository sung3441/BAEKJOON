import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            String num = st.nextToken();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        br.readLine();
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            sb.append(map.getOrDefault(st.nextToken(), 0)).append(" ");
        }

        System.out.println(sb);
    }
}