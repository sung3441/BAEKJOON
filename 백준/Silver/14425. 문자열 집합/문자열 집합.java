import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;
        
        
        while (n-- > 0) set.add(br.readLine());
        
        while (m-- > 0) if (set.contains(br.readLine())) result++;
        
        System.out.print(result);
    }
}