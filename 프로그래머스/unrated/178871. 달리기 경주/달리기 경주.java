import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i  = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            Integer rank = map.get(calling);
            
            players[rank] = players[rank - 1];
            players[rank - 1] = calling;
            
            map.put(calling, rank - 1);
            map.put(players[rank], rank);
        }
        
        return players;
    }
}