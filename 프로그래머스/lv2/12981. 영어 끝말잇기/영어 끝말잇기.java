import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        char last = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (set.contains(word) || last != word.charAt(0)) {
                return new int[]{i % n + 1, i / n + 1};
            }
            last = word.charAt(word.length() - 1);
            set.add(word);
        }

        return new int[2];
    }
}