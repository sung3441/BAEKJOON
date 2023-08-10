class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int col = 3;

        for (; sum / col > 2; col++) {
            int row = sum / col;
            if (col * row == sum && brown == (row * 2) + (col * 2 - 4)) {
                break;
            }
        }

        int max = Math.max(col, sum / col);
        return new int[]{max, sum / max};
    }
}