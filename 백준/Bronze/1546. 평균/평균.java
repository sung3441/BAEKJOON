import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int  M = 0;
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(st.nextToken());
			arr[i] = score;
			if (score > M) {
				M = score;
			}
		}
		for (int i = 0; i < n; i++) {
			sum += newScore(M, arr[i]);
		}
		System.out.println(sum / n);
	}
	
	static double newScore(int M, int score) {
		return ((double) score / M) * 100;
	}
}