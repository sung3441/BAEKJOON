import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        ArrayList<Stage> stageList = new ArrayList();
        for (int i = 0; i < N; i++) {
            stageList.add(new Stage(i + 1));
        }

        for (int stage : stages) {
            for (int i = 0; i < stage; i++) {
                if (i != N) { // clear 스테이지가 아니면, 현재 스테이지 도전
                    stageList.get(i).challengersCnt += 1;
                }
                if (i != 0) { // 1 스테이지가 아니면, 이전 스테이지 finish
                    stageList.get(i - 1).finishersCnt += 1;
                }
            }
        }

        for (Stage stage : stageList) {
            stage.setFailureRate();
        }

        return stageList.stream()
                .sorted(Comparator.comparing(Stage::getFailureRate))
                .mapToInt(i -> i.level).toArray();
    }
}

class Stage {

    int level;
    int challengersCnt = 0;
    int finishersCnt = 0;
    double failureRate;

    public Stage(int level) {
        this.level = level;
    }

    void setFailureRate() {
        this.failureRate = (double) finishersCnt / challengersCnt;
    }

    double getFailureRate() {
        return this.failureRate;
    }
}