import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        String space = sc.nextLine(); //줄 바꿈용
        
        String result = "";
        
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num < x){
                result += num+" ";
            }
        }
        System.out.println(result);
    }
}