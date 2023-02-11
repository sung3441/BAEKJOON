import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String word = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        System.out.print(Arrays.stream(word.split(" ")).filter(s -> !s.isEmpty()).count());
    }
}