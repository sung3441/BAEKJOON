import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] resultArr = new String[]{"Invalid", "Equilateral", "Isosceles", "Scalene"};

        while (true) {
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            st = new StringTokenizer(br.readLine());
            int[] sort = Arrays.stream(arr).sorted().toArray();
            if (sort[2] >= sort[0] + sort[1]) {
                sb.append(resultArr[0]).append("\n");
                continue;
            }
            sb.append(resultArr[(int) Arrays.stream(sort).distinct().count()]).append("\n");
        }

        System.out.println(sb);
    }
}