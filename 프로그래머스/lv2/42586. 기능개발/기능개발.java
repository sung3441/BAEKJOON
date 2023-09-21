import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> result = new ArrayList();
        boolean[] flags = new boolean[progresses.length];
        int startIndex = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = startIndex; j < progresses.length; j++) {
                if (!flags[j]) {
                    progresses[j] += speeds[j];
                    if (progresses[j] >= 100) {
                        flags[j] = true;
                    }
                }
            }
            boolean insert = true;
            for (int j = startIndex; j < progresses.length; j++) {
                if (!flags[j]) {
                    if (startIndex != j) {
                        result.add(j - startIndex);
                        startIndex = j;
                    }
                    insert = false;
                    break;
                }
            }
            if (insert) {
                result.add(progresses.length - startIndex);
                break;
            }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}