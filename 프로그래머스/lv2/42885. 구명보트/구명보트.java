import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        if (people.length > 1 && people[0] + people[1] > limit) {
            return people.length;
        }
        
        for (int i = people.length - 1, min = 0; min <= i; i--) {
            if (people[i] + people[min] <= limit) {
                min++;
            }
            answer++;
        }
        return answer;
    }
}