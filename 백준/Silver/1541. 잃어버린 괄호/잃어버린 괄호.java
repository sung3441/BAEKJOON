import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String[] nums = text.replaceAll("[+-]", " ").split(" ");
        String[] operators = text.replaceAll("[0-9]", "").split("");
        int sum = Integer.parseInt(nums[0]);
        boolean flag = false;
        
        for (int i = 0, count = 1; i < operators.length && count < nums.length; i++) {
            int num = Integer.parseInt(nums[count++]);
            if (!flag && "-".equals(operators[i])) {
                flag = true;
            }
            sum += flag ? num * -1 : num;
        }
        System.out.println(sum);
    }
}