import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int x = 1;
        int y = 1;
        
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }
        
        System.out.print(max + "\n" + x + " " + y);
    }
}