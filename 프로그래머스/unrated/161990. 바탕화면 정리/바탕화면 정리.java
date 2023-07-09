class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int minX = 50;
        int minY = 50;
        int maxX = -1;
        int maxY = -1;
        
        for (int i = 0; i < wallpaper.length; i++) {
            String s = wallpaper[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '#') {
                    minX = i < minX ? i : minX;
                    minY = j < minY ? j : minY;
                    maxX = i > maxX ? i : maxX;
                    maxY = j > maxY ? j : maxY;
                }
            }
        }
        
        return new int[]{minX, minY, maxX  + 1, maxY + 1};
    }
}