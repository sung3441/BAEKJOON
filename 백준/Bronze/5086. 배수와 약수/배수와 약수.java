import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals(arr[1])) {
                break;
            }
            System.out.println(solution(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
        }
    }

    static String solution(int a, int b) {
        if (b % a == 0) {
            return "factor";
        }
        if (a % b == 0) {
            return "multiple";
        }
        return "neither";
    }
}