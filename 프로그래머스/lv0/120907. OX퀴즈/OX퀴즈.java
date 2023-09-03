class Solution {
    public String[] solution(String[] quiz) {
        String[] results = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[2]);
            int z = Integer.parseInt(split[4]);
            String operator = split[1];
            int result = "+".equals(operator) ? x + y : x - y;
            results[i] = result == z ? "O" : "X";
        }
        return results;
    }
}