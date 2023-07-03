class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        for (int i = 2; i + i < arr.length; i++) {
            for (int j = i + i; j < arr.length; j += i) {
                if (arr[j]) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                answer++;
            }
        }
        return answer;
    }
}