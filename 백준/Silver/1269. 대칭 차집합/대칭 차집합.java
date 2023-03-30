import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Boolean> map = new HashMap<>();
        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        int result = 0;

        String[] arrN = br.readLine().split(" ");
        String[] arrM = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            map.put(arrN[i], false);
        }

        for (int j = 0; j < m; j++) {
            String key = arrM[j];
            map.put(key, map.containsKey(key));
        }

        for (String key : map.keySet()) {
            if (!map.get(key)) {
                result++;
            }
        }
        System.out.print(result);
    }
}