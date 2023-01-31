import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList();
        for (int i = 1; i <= 30; i++) {
            list.add(Integer.toString(i));
        }
        for (int i = 0; i < 28; i++) {
            list.remove(br.readLine());
        }
        System.out.println(Integer.parseInt(list.get(0)));
        System.out.println(Integer.parseInt(list.get(1)));
    }
}