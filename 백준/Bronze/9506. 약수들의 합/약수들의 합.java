import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        while (!"-1".equals(num)) {
            System.out.println(solution(Integer.parseInt(num)));
            num = br.readLine();
        }
    }

    static String solution(int num) {
        int sum = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(num + " = 1");

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                if (sum > num) {
                    return num + " is NOT perfect.";
                }
                sb.append(" + " + i);
            }
        }
        return num == sum ? sb.toString() : num + " is NOT perfect.";
    }
}