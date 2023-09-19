import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap();
        String[] tuples = bracketRemoveal(s).split("(?<=\\}),(?=\\{)");;
        int numberCount = 0;
        
        for (String tuple : tuples) {
            int[] numbers = toNumbers(bracketRemoveal(tuple));
            
            for (int number : numbers) {
                boolean hasKey = map.containsKey(number);
                if (!hasKey) {
                    numberCount++;
                }
                map.put(number, hasKey ? map.get(number) + 1 : 1);   
            }
        }
        
        int[] answer = new int[numberCount];
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            answer[numberCount - value] = key;
        }
        
        return answer;
    }
    
    String bracketRemoveal(String s) {
        if (s.startsWith("{") && s.endsWith("}")) {
            s = s.substring(1, s.length() - 1);
        }
        return s;
    }
    
    int[] toNumbers(String stringNumber) {
        String[] stringNumbers = stringNumber.split(",");
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        return numbers;
    }
}