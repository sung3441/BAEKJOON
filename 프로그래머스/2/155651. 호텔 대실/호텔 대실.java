class Solution {
    
    public int solution(String[][] book_time) {
        int result = 0;
        
        int[] arr = new int[1_450];
        for (String[] times : book_time) {
            arr[calTime(times[0])] += 1;
            arr[calTime(times[1]) + 10] -= 1;
        }
        
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            result = Math.max(result, arr[i]);
        }
        return result;
    }
    
    int calTime(String timeStr) {
        String[] times = timeStr.split(":");
        int start = Integer.parseInt(times[0]);
        int end = Integer.parseInt(times[1]);
        return start * 60 + end;
    }
}