import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String>[] arr = new ArrayList[50];

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            int length = word.length() - 1;
            if (arr[length] == null) {
                arr[length] = new ArrayList<>();
            }
            arr[length].add(word);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            arr[i].stream().distinct().sorted().forEach(System.out::println);
        }
    }
}