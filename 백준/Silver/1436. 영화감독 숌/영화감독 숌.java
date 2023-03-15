import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 666;
        for (int i = 2; i <= n;) {
            result++;
            if (String.valueOf(result).indexOf("666") != -1) {
                i++;    
            }
        }
        System.out.print(result);
    }
}