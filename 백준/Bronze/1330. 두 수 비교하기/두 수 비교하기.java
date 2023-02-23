import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.print(solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
    
    static String solution(int a, int b) {
        if(a > b) return ">";
        if(a < b) return "<";
        return "==";
    }
}