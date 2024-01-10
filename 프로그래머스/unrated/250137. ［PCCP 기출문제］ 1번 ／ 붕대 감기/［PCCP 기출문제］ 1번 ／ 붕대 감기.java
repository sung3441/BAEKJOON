import java.util.*;

public class Solution {

    public int solution(int[] bandage, int health, int[][] attacks) {
        int heelGauge = 0;
        int maxHealth = health;
        int attackIndex = 0;
        for (int i = 0; i <= 1_000; i++) {
            if (attackIndex == attacks.length) {
                break;
            }

            if (attacks[attackIndex][0] == i) {
                health -= attacks[attackIndex++][1];
                if (1 > health) {
                    return -1;
                }
                heelGauge = 0;
                continue;
            }
            
            heelGauge++;
            int heelAmount = bandage[1];
            if (heelGauge == bandage[0]) {
                heelGauge = 0;
                heelAmount += bandage[2];
            }
            health = Math.min(health + heelAmount, maxHealth);
        }

        return health;
    }
}