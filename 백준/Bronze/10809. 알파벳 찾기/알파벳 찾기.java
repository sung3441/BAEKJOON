import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String word = new BufferedReader(new InputStreamReader(System.in)).readLine();
        IntStream.range(97, 123).forEach(i -> System.out.print(word.indexOf(i) + " "));
    }
}