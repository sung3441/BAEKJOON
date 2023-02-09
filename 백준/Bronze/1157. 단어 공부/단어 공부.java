import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static String word;
    static String result = "?";
    static int count = 0;
    
    public static void main(String[] args) throws Exception {
        String word = new BufferedReader(new InputStreamReader(System.in))
            .readLine().toUpperCase();
        word.chars().mapToObj(c -> (char) c).distinct()
                .forEach(c -> {
                    int diff = word.length() - word.replaceAll(c.toString(), "").length();
                    if (diff >= count) {
                        result = diff == count ? "?" : c.toString();
                        count = diff;
                    }
                });
        System.out.println(result);
    }
}