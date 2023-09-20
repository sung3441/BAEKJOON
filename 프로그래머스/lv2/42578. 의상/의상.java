import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap();
        int answer = 1;
        for (String[] clothe : clothes) {
            clothesMap.put(clothe[1], clothesMap.getOrDefault(clothe[1], 0) + 1);
        }
        
        for (String key : clothesMap.keySet()) {
            answer *= clothesMap.get(key) + 1;
        }
        
        return answer - 1;
    }
}