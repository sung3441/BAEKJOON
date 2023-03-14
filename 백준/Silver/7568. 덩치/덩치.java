import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Person[] arr = new Person[n];
        for (int i = 0; i < arr.length; i++) {
            String[] split = br.readLine().split(" ");
            int weight = Integer.parseInt(split[0]);
            int height = Integer.parseInt(split[1]);

            arr[i] = new Person(weight, height);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr[i].compareTo(arr[j]);
            }
        }

        for (Person person : arr) {
            sb.append(person.rank).append(" ");
        }

        System.out.println(sb);
    }
}

class Person {
    int weight;
    int height;
    int rank;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.rank = 1;
    }

    public void compareTo(Person target) {
        // 현재를 기준으로 1 은 크다, 0은 같다, -1은 작다
        if (weight > target.weight && height > target.height) {
            target.rank++;
            return;
        }
        if (weight < target.weight && height < target.height) {
            rank++;
            return;
        }
    }
}