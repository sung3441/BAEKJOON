import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) numArr[i] = Integer.parseInt(br.readLine());
        boolean[] sosuArr = getSosuArr(Arrays.stream(numArr).max().getAsInt());

        for (int i = 0; i < numArr.length; i++) {
            int minSosu = 10_000;
            int num = numArr[i];

            for (int j = 2; j + j <= num; j++) {
                if (sosuArr[j] && sosuArr[num - j]) {
                    if (afterSosuSmaller(minSosu, j, num)) {
                        minSosu = j;
                    }
                }
            }
            printResult(num, minSosu);
        }
    }

    static boolean[] getSosuArr(int num) {
        boolean[] arr = new boolean[num];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;

        for (int i = 2; i < num; i++) {
            if (arr[i]) {
                for (int j = i * 2; j < arr.length; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }

    static void printResult(int num, int sosu) {
        int a = sosu < num - sosu ? sosu : num - sosu;
        int b = num - a;
        System.out.println(a + " " + b);
    }

    static boolean afterSosuSmaller(int beforeSosu, int afterSosu, int num) {
        return Math.abs((beforeSosu * 2) - num) > Math.abs((afterSosu * 2) - num);
    }
}