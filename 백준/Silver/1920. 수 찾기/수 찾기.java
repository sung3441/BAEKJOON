import java.util.Scanner;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet();
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		while (n-- > 0) {
		    set.add(sc.nextInt());
		}
		
		int m = sc.nextInt();
		while (m-- > 0) {
		    sb.append(set.contains(sc.nextInt()) ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
}