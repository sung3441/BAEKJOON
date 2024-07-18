import java.util.*;

public class Solution {

    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health; // 최대 체력
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량
        int lastAttackTime = 0; // 마지막 공격 시간
        
        for (int[] attack : attacks) {
            int attackTime = attack[0]; // 공격 시간
            int damage = attack[1]; // 피해량
            
            // 이전 힐량 계산
            int heelTime = attackTime - lastAttackTime - 1; // 맞은 순간에는 힐 못함
            int heel = (x * heelTime) + (heelTime / t * y);
            health = Math.min(health + heel, maxHealth);
            
            // 피해량 적용
            health -= damage;
            if (health <= 0) {
                return -1;
            }
            lastAttackTime = attackTime;
        }
        return health;
    }
}