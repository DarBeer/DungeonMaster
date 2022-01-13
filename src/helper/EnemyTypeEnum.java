package helper;

import entity.Boss;
import entity.Enemy;
import entity.Skeleton;

public enum EnemyTypeEnum implements TypeEnum {
    BOSS(new Boss()),
    SKELETON(new Skeleton());

    private final Enemy enemy;

    EnemyTypeEnum(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String getTypeName() {
        return enemy.getClass().getTypeName();
    }

    public static Enemy getByTypeName(String typeName) {
        for (EnemyTypeEnum enemyType: EnemyTypeEnum.values()) {
            if (enemyType.getTypeName().equals(typeName)) {
                return enemyType.enemy;
            }
        }
        throw new NullPointerException("Сущности противника с таким названием не существует.");
    }
}
