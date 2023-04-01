import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, Boolean> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        while (n-- > 0) {
            String[] split = br.readLine().split(" ");
            String name = split[0];
            if ("enter".equals(split[1])) {
                map.put(name, true);
                continue;
            }
            map.put(name, false);
        }
        for (String key : map.keySet()) {
            if (map.get(key)) {
                list.add(key);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        for (String name : list) {
            sb.append(name).append("\n");
        }
        System.out.print(sb);
    }
}