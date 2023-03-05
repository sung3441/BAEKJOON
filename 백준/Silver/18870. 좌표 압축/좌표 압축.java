import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        br.readLine();
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] sort = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i = 0; i < sort.length; i++) {
            map.put(sort[i], i);
        }

        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}