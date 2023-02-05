import java.util.stream.IntStream;

class Solution {
    public int solution(String t, String p) {
        return (int) IntStream.range(0, t.length() - p.length() + 1)
                .mapToObj(i -> Long.parseLong(t.substring(i, i + p.length())))
                .filter(i -> Long.parseLong(p) >= i)
                .count();
    }
}