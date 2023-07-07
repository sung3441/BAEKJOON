import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = n - lost.length;
        HashSet<Integer> reserveSet = new HashSet();
        Set<Integer> lostSet = Arrays.stream(lost).boxed().collect(Collectors.toSet());
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i = 0; i < lost.length; i++) {
            int target = lost[i];
            for (int j = 0; j < reserve.length; j++) {
                int clothes = reserve[j];
                if (target == clothes || target - 1 == clothes || target + 1 == clothes) {
                    if (reserveSet.contains(clothes) || (target != clothes && lostSet.contains(clothes))) {
                        continue;
                    }
                    answer++;
                    reserveSet.add(clothes);
                    break;
                }
            }
        }
        return answer;
    }
}