class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = num % 2 == 0 ? (total / num) - (total % num) + 1 : (total / num) - num / 2;
        for (int i = 0; i < num; i++)
            answer[i] = start + i;
        return answer;
    }
}