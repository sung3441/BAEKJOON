import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int result = 0;
        final int sendCountIndex = 0;
        final int receiveCountIndex = 1;
        Map<String, Map<String, Integer>> friendsMap = new HashMap<>();
        Map<String, Integer[]> presentCountMap = new HashMap<>(); // 0: send, 1: receive
        for (String friendName : friends) {
            friendsMap.put(friendName, new HashMap<>());
            presentCountMap.put(friendName, new Integer[]{0, 0});
        }

        for (String gift : gifts) {
            String senderName = gift.split(" ")[0];
            String receiverName = gift.split(" ")[1];

            Map<String, Integer> sender = friendsMap.get(senderName);
            sender.put(receiverName, sender.getOrDefault(receiverName, 0) + 1);

            presentCountMap.get(senderName)[sendCountIndex] += 1;
            presentCountMap.get(receiverName)[receiveCountIndex] += 1;
        }

        // 내가 받을 경우에만 결과 처리
        for (String senderName : friends) {
            int presentCount = 0;
            Map<String, Integer> sender = friendsMap.get(senderName);
            for (String receiverName : friends) {
                if (senderName.equals(receiverName)) {
                    continue;
                }
                Map<String, Integer> receiver = friendsMap.get(receiverName);
                int sendCount = sender.getOrDefault(receiverName, 0);
                int receiveCount = receiver.getOrDefault(senderName, 0);

                if (receiveCount > sendCount) {
                    continue;
                }

                if (sendCount == receiveCount) {
                    int senderPresentCount = presentCountMap.get(senderName)[sendCountIndex] - presentCountMap.get(senderName)[receiveCountIndex];
                    int receiverPresentCount = presentCountMap.get(receiverName)[sendCountIndex] - presentCountMap.get(receiverName)[receiveCountIndex];
                    if (receiverPresentCount >= senderPresentCount) {
                        continue;
                    }
                }
                presentCount++;
            }
            result = Math.max(result, presentCount);
        }
        return result;
    }
}