class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        int count = 0;

        for (long i = left; i <= right; i++) {
            int row = (int) (i / n + 1);
            int col = (int) (i % n);
            if (col >= row) {
                row += (col - row + 1);
            }
            answer[count++] = row;
        }

        return answer;
    }
}