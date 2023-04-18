import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        List<Character> alphas = IntStream.range(97, 123).mapToObj(i -> (char) i).filter(i -> skip.indexOf(i) == -1).collect(Collectors.toList());

        for (int i = 0; i < s.length(); i++) {
            sb.append(alphas.get((alphas.indexOf(s.charAt(i)) + index) % alphas.size()));
        }
        return sb.toString();
    }
}