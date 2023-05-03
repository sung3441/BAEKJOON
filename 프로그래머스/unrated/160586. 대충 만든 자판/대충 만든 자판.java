import java.util.*;

public class Solution {
    public static int[] solution(String[] keymap, String[] targets){

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int minPress = getMinButtonPress(target, keymap);
            answer[i] = minPress;
        }

        return answer;
    }

    private static int getMinButtonPress(String target, String[] buttonMap) {
        int totalButtonCount = 0;
        for (char c : target.toCharArray()) {
            int minButtonCount = Integer.MAX_VALUE;
            for (String button : buttonMap) {
                int buttonCount = button.indexOf(c) + 1;
                if (buttonCount > 0 && buttonCount < minButtonCount) {
                    minButtonCount = buttonCount;
                }
            }
            if (minButtonCount == Integer.MAX_VALUE) {
                return -1;
            }
            totalButtonCount += minButtonCount;
        }
        return totalButtonCount;
    }

    public static void main(String[] args) {
        String[] s1 = {"ABACD", "BCEFD"};
        String[] s2 = {"ABCD" , "AABB"};
        System.out.println(Arrays.toString(solution(s1, s2)));
    }
}