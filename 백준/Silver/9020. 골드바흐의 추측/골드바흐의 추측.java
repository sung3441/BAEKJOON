import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        // 이 값을 기준으로 뭐시기의 체 만들면 됨
        int max = Arrays.stream(numArr).max().getAsInt();
        boolean[] sosuArr = getSosuArr(max);

        for (int i = 0; i < numArr.length; i++) {
            HashMap<Integer, Integer> diffMap = new HashMap<>();
            int minDiff = 10_000;
            int num = numArr[i];

            for (int j = 2; j + j <= num; j++) {
                if (sosuArr[j] && sosuArr[num - j]) {
                    int diff = Math.abs(j - (num - j));
                    if (minDiff > diff) {
                        minDiff = diff;
                        diffMap.put(diff, j);
                    }
                }
            }
            printResult(num, diffMap.get(minDiff));
        }
    }

    static boolean[] getSosuArr(int num) {
        boolean[] arr = new boolean[num];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i < num; i++) {
            if (arr[i]) {
                for (int j = i * 2; j < arr.length; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }

    private static void printResult(int num, int sosu) {
        int a = sosu < num - sosu ? sosu : num - sosu;
        int b = num - a;
        System.out.println(a + " " + b);
    }
}