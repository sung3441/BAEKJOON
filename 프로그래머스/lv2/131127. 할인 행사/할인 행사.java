import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> clone = new HashMap<>(map);

            for (int j = i; j < i + 10; j++) {
                String name = discount[j];
                if (clone.containsKey(name)) {
                    Integer count = clone.get(name);
                    if (count <= 1) {
                        clone.remove(name);
                        continue;
                    }
                    clone.replace(name, count - 1);
                }
            }

            if (clone.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}