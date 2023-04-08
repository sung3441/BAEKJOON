import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.print(isPalindrome(word) ? 1 : 0);
        
    }
    static boolean isPalindrome(String word) {
        for (int i = 0; i < Math.round(word.length() / 2); i++) {
            if (word.charAt(i) == word.charAt((word.length() - 1) - i)) {
                continue;
            }
            return false;
        }
        return true;
    } 
}