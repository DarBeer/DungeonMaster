package entity;

import helper.AttackCoefficientEnum;

public class Boss extends Warrior implements Enemy {
    @Override
    public int bonk(int health, int enemyCount) {
        return (int) (health - (health/enemyCount) * AttackCoefficientEnum.BOSS.getAttackCoefficient());
    }

    @Override
    public String getName() {
        return "Boss Skeletor";
    }
}
