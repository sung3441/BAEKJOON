import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            String word = br.readLine();
            HashMap<Character, Integer> map = new HashMap();
            for (int j = 0; j < word.length(); j++) {
                char key = word.charAt(j);
                Integer value = map.get(key);
                if (value != null && (value + 1) != j) {
                    flag = false;
                    break;
                }
                map.put(key, j);
            }
            if (flag) {
                result++;
            }
        }
        System.out.println(result);
    }
}