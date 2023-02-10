import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] arr = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        System.out.print(Arrays.stream(arr)
                         .mapToInt(s -> Integer.parseInt(new StringBuilder(s).reverse().toString()))
                         .max().getAsInt());
    }
}