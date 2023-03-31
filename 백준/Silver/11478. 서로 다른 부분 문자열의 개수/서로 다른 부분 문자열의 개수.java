import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String word = br.readLine();

        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j <= word.length() - i; j++) {
                String part = word.substring(j, j + i);
                if (!set.contains(part)) {
                    set.add(part);
                }
            }
        }
        System.out.println(set.size());
    }
}