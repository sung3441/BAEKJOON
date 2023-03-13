import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] sortedArr = Arrays.copyOf(arr, n);
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int num : sortedArr) {
            if (!map.containsKey(num)) {
                map.put(num, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb.toString());
    }
}