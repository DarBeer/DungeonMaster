package helper;

public enum AttackCoefficientEnum {
    BOSS(0.3f),
    SKELETON(0.2f),
    PLAYER(10);

    private final float attackCoefficient;

    AttackCoefficientEnum(float attackCoefficient) {
        this.attackCoefficient = attackCoefficient;
    }

    public float getAttackCoefficient() {
        return attackCoefficient;
    }
}
