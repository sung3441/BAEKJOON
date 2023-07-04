import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    ArrayList<Integer> numList = new ArrayList();
    
    public int solution(String numbers) {
        int answer = 0;
        String[] arr = numbers.split("");
        String[] output = new String[arr.length];
        boolean[] visited = new boolean[arr.length];
        
        for (int i = 1; i <= arr.length; i++) {
            permutation(arr, output, visited, 0, i);
        }
        
        int max = Collections.max(numList);
        boolean[] primeArr = getPrimeArr(max);
        
        for (int i = 0; i < numList.size(); i++) {
            if (primeArr[numList.get(i)]) {
                answer++;
                primeArr[numList.get(i)] = false;
            }
        }
        
        return answer;
    }
    
    void permutation(String arr[], String output[], boolean visited[], int depth, int r) {
        if (depth == r) {
            String result = "";
            for (int i = 0; i < r; i++) {
                result += output[i];
            }
            numList.add(Integer.parseInt(result));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }
    
    boolean[] getPrimeArr(int num) {
        boolean[] primeArr = new boolean[num + 1];
        for (int i = 2; i < primeArr.length; i++) {
            primeArr[i] = true;
        }
        
        for (int i = 2; i < Math.sqrt(primeArr.length); i++) {
            for (int j = i + i; j < primeArr.length; j += i) {
                if (primeArr[j]) {
                    primeArr[j] = false;
                }
            }
        }
        
        return primeArr;
    }
}