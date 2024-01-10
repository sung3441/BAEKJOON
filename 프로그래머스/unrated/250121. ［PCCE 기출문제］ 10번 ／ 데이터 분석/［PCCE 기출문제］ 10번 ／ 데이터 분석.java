import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Map<String, Integer>> dataList = new ArrayList<>();
        for (int[] d : data) {
            Map<String, Integer> map = new HashMap<>();
            map.put("code", d[0]);
            map.put("date", d[1]);
            map.put("maximum", d[2]);
            map.put("remain", d[3]);
            dataList.add(map);
        }

        dataList = dataList.stream()
                .filter(m -> val_ext > m.get(ext))
                .sorted(Comparator.comparingInt(m -> m.get(sort_by)))
                .collect(Collectors.toList());

        int[][] result = new int[dataList.size()][data[0].length];
        for (int i = 0; i < dataList.size(); i++) {
            Map<String, Integer> map = dataList.get(i);
            result[i] = new int[]{map.get("code"), map.get("date"), map.get("maximum"), map.get("remain")};
        }

        return result;
    }
}