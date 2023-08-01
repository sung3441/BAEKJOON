import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] distance = new int[n - 1];
		int[] price = new int[n];
		
		for (int i = 0; i < distance.length; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < price.length; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		int lowPrice = price[0];
		int sum = distance[0] * lowPrice;
		
		for (int i = 1; i < n - 1; i++) {
			lowPrice = Math.min(lowPrice, price[i]);
			sum += distance[i] * lowPrice;
		}
		
		System.out.print(sum);
	}
}