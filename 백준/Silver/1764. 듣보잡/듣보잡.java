import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> result = new ArrayList();
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);

        while (n-- > 0) {
            set.add(br.readLine());
        }

        while (m-- > 0) {
            String name = br.readLine();
            if (set.contains(name)) {
                result.add(name);
            }
        }

        sb.append(result.size()).append("\n");
        result.stream().sorted().forEach(s -> sb.append(s).append("\n"));
        System.out.println(sb);
    }
}