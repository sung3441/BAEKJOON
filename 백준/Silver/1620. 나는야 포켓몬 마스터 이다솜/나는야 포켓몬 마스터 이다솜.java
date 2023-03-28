import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> stringMap = new HashMap<>();
        HashMap<String, String> integerMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int count = 1;

        while (n-- > 0) {
            String name = br.readLine();
            if (!stringMap.containsKey(name)) {
                stringMap.put(name, count);
                integerMap.put(String.valueOf(count++), name);
            }
        }

        while (m-- > 0) {
            String key = br.readLine();
            Object value = stringMap.containsKey(key) ? stringMap.get(key) : integerMap.get(key);
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}