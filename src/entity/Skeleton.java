package entity;

import helper.AttackCoefficientEnum;

public class Skeleton extends Warrior implements Enemy{
    @Override
    public int bonk(int health, int enemyCount) {
        return (int) (health - (health/enemyCount) * AttackCoefficientEnum.SKELETON.getAttackCoefficient());
    }
}
