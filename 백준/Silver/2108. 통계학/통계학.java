import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        arr = Arrays.stream(arr).sorted().toArray();

        System.out.print(sb.append(산술평균(arr)).append("\n")
                .append(중앙값(arr)).append("\n")
                .append(최빈값(arr)).append("\n")
                .append(범위(arr)));
    }

    static int 산술평균(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return (int) Math.round((double) sum / arr.length);
    }

    static int 중앙값(int[] arr) {
        return arr[arr.length / 2];
    }

    static int 최빈값(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > max) {
                sb.setLength(0);
                sb.append(i);
                max = map.get(i);
                continue;
            }
            if (map.get(i) == max) {
                sb.append(",").append(i);
                continue;
            }
        }
        String numStr = sb.indexOf(",") == -1 ? sb.toString() : sb.toString().split(",")[1];
        return Integer.parseInt(numStr);
    }

    static int 범위(int[] arr) {
        return arr[arr.length - 1] - arr[0];
    }
}