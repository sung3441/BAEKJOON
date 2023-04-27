import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {

    public int solution(int [] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 1});

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            if (stack.size() < 4) {
                continue;
            }
            if (list.equals(stack.subList(stack.size() - 4, stack.size()))) {
                answer++;
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
        return answer;
    }
}