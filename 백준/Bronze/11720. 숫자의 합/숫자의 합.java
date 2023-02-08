import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(process());
    }
    
    static int process() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        return (int) IntStream.range(0, n)
            .mapToLong(i -> Character.getNumericValue(str.charAt(i)))
            .sum();
    }
}