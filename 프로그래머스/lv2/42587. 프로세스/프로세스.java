import java.util.ArrayList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        ArrayList<Process> list = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            list.add(new Process(i, priorities[i]));
        }

        int max = getMax(list);
        while (!list.isEmpty()) {
            Process process = list.get(0);
            list.remove(process);
            if (max == process.priority) {
                max = getMax(list);
                if (process.index == location) {
                    break;
                }
                answer++;
                continue;
            }
            list.add(process);
        }
        return answer;
    }

    int getMax(ArrayList<Process> list) {
        int max = -1;
        for (Process process : list) {
            max = Math.max(process.priority, max);
        }
        return max;
    }

    static class Process {
        int index;
        int priority;

        public Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}