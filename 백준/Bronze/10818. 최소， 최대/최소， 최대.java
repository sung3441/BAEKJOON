import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
	
		int min = 1_000_000;
		int max = -1_000_000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		System.out.print(min + " " + max);
	}
}