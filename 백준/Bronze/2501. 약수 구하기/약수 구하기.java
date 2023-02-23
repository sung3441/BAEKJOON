import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        System.out.print(solution(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
    }

    static int solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        if (k > list.size()) {
            return 0;
        }
        return list.get(k - 1);
    }
}