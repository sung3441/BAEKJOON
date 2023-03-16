import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5});
        for (String s : result) {
            System.out.println(s);
        }
    }

    public String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();

        for (int courseCount : course) {
            List<String> bestCourseList = getBestCourseList(orders, courseCount);
            for (String bestCourse : bestCourseList) {
                result.add(bestCourse);
            }
        }
        Collections.sort(result);
        return result.toArray(new String[result.size()]);
    }

    public List<String> getBestCourseList(String[] orders, int courseCount) {
        List<String> bestCourseList = new ArrayList<>();
        HashMap<String, Integer> courseMap = new HashMap<>();

        for (String order : orders) {
            if (order.length() < courseCount) continue;

            List<String> menus = Arrays.stream(order.split("")).sorted().collect(Collectors.toList());
            boolean[] visited = new boolean[menus.size()];

            orderStatistics(menus, visited, 0, menus.size(), courseCount, courseMap); // 주문 통계
        }

        Integer maxOrderCount = courseMap.values().isEmpty() ? 1 : Collections.max(courseMap.values());
        if (maxOrderCount < 2) { // 최소 두 명 이상이 주문한 조합
            return bestCourseList;
        }

        for (String combo : courseMap.keySet()) {
            Integer orderCount = courseMap.get(combo);
            if (orderCount == maxOrderCount) {
                bestCourseList.add(combo);
            }
        }
        return bestCourseList;
    }

    // 백 트랙킹 알고리즘
    public void orderStatistics(List<String> menus, boolean[] visited, int start, int n, int r, HashMap<String, Integer> courseMap) {
        if (r == 0) {
            String courseMenu = mergeMenu(menus, visited, n);
            courseMap.put(courseMenu, courseMap.getOrDefault(courseMenu, 0) + 1);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            orderStatistics(menus, visited, i + 1, n, r - 1, courseMap);
            visited[i] = false;
        }
    }

    public String mergeMenu(List<String> menus, boolean[] visited, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                sb.append(menus.get(i));
            }
        }
        return sb.toString();
    }
}