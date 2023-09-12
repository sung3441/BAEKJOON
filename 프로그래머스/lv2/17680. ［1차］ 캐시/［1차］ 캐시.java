import java.util.ArrayList;

class Solution {
    
    public ArrayList<String> cache;
    
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        cache = new ArrayList<>();

        for (String city : cities) {
            city = city.toLowerCase();
            boolean hasCity = hasCity(city);
            int time = hasCity ? 1 : 5;

            if (cache.size() >= cacheSize) {
                if (hasCity) {
                    cache.remove(city);
                } else {
                    cache.remove(0);
                }
            }
            cache.add(city);
            answer += time;
        }
        return answer;
    }
    
    boolean hasCity(String target) {
        return cache.stream().anyMatch(city -> city.equals(target));
    }
}