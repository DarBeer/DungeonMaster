package entity;

import helper.AttackCoefficientEnum;

public class Player extends Warrior {
    @Override
    public int bonk(int health, int enemyCount) {
        return (int) (health - (attackDamage + AttackCoefficientEnum.PLAYER.getAttackCoefficient()));
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}
