class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
		int maxWidth = 0;
		int maxHeight = 0;
		
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][1] > sizes[i][0]) {
				int temp = sizes[i][1];
				sizes[i][1] = sizes[i][0];
				sizes[i][0] = temp;
			}
			maxWidth = sizes[i][0] > maxWidth ? sizes[i][0] : maxWidth;
			maxHeight = sizes[i][1] > maxHeight ? sizes[i][1] : maxHeight;
		}
		
        return maxWidth * maxHeight;
    }
}