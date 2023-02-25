class Solution {
    public int solution(int[][] dots) {
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int point = (Math.abs(i - j)) % 2 == 0 ? 1 : 2;
                int indexI = (j + point) % 4;
                int indexJ = (i + point) % 4;

                int x1 = dots[i][0] - dots[j][0];
                int y1 = dots[i][1] - dots[j][1];
                int x2 = dots[indexI][0] - dots[indexJ][0];
                int y2 = dots[indexI][1] - dots[indexJ][1];

                if ((double) x1 / y1 == (double) x2 / y2) {
                    return 1;
                }
            }
        }
        return 0;
    }
}