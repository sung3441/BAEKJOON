class Solution {
    public int solution(int[][] dots) {
        
        if (Math.abs((double) (dots[0][0] - dots[1][0]) / (dots[0][1] - dots[1][1])) == Math.abs((double) (dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1]))) {
            return 1;
        }
        
        if (Math.abs((double) (dots[0][0] - dots[2][0]) / (dots[0][1] - dots[2][1])) == Math.abs((double) (dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1]))) {
            System.out.println("2");
            return 1;
        }
        
        if (Math.abs((double) (dots[0][0] - dots[3][0]) / (dots[0][1] - dots[3][1])) == Math.abs((double) (dots[2][0] - dots[1][0]) / (dots[2][1] - dots[1][1]))) {
            System.out.println("3");
            return 1;
        }
        
        return 0;
    }
}