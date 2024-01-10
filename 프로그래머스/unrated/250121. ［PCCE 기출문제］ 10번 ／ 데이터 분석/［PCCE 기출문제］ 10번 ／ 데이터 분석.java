import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> columnList = Arrays.asList("code", "date", "maximum", "remain");
        int filterIndex = columnList.indexOf(ext);
        int sortIndex = columnList.indexOf(sort_by);

        return Arrays.stream(data)
                .filter(o -> val_ext > o[filterIndex])
                .sorted(Comparator.comparingInt(o -> o[sortIndex]))
                .toArray(int[][]::new);
    }
}