import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Meet[] arr = new Meet[n];
		StringTokenizer st;
		
		for (int i = 0; i < arr.length; i++) {
		    st = new StringTokenizer(br.readLine());
		    arr[i] = new Meet(st.nextToken(), st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int count = 1;
		int start = arr[0].start;
		int end = arr[0].end;
		
		for (int i = 1; i < arr.length; i++) {
		    if (arr[i].start >= end) {
		        count++;
		        start = arr[i].start;
		        end = arr[i].end;
		    }
		}
		
		System.out.print(count);
	}
	
	static class Meet implements Comparable<Meet> {
	    int start;
	    int end;
	    
	    public Meet(String start, String end) {
	        this.start = Integer.parseInt(start);
	        this.end = Integer.parseInt(end);
	    }
	    
	    @Override
	    public int compareTo(Meet meet) {
	        if (this.end == meet.end) {
	            return this.start - meet.start;
	        }
	        return this.end - meet.end;
	    }
	}
}
