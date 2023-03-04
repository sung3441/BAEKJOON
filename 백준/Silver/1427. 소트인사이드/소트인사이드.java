import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        br.readLine().chars()
                .boxed().sorted(Collections.reverseOrder())
                .forEach(i -> sb.append((char) i.intValue()));
        System.out.println(sb);
    }
}