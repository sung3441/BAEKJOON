import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        List<Integer> allList = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        for (int i = 1; i <= 10_000; i++) {
            allList.add(i);
            sumList.add(getSum(i));
        }
        allList.removeAll(sumList);
        for (int i : allList) {
            sb.append(i + "\n");
        }
        System.out.print(sb);
    }
    
    static int getSum(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}