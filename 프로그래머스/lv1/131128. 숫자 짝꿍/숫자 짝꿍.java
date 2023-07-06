import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public String solution(String X, String Y) {
        int[] arr = new int[10];
        StringBuilder sb = new StringBuilder();
        char[] chars = Y.toCharArray();
        Arrays.sort(chars);
        boolean onlyZero = true;
        
		for (int i = 0; i < X.length(); i++) {
            arr[(int) X.charAt(i) - '0']++;
        }
        
        for (int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            int index = (int) c - '0';
            if (arr[index] > 0) {
                arr[index]--;
                sb.append(index);
                if (onlyZero && index != 0) {
                    onlyZero = false;
                }
            } 
        }
        
        if (sb.length() == 0) {
            return "-1";
        }
		
		if (onlyZero) {
			return "0";
		}
		
        return sb.toString();
    }
}