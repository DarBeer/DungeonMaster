package helper;

import entity.Boss;
import entity.Player;
import entity.Skeleton;
import entity.Warrior;

public enum WarriorTypeEnum {
    BOSS(new Boss()),
    ENEMY(new Skeleton()),
    PLAYER(new Player());

    private final Warrior warrior;

    WarriorTypeEnum(Warrior warrior) {
        this.warrior = warrior;
    }

    public String getTypeName() {
        return warrior.getClass().getTypeName();
    }

    public static Warrior getByTypeName(String typeName) {
        for (WarriorTypeEnum warriorType: WarriorTypeEnum.values()) {
            if (warriorType.getTypeName().equals(typeName)) {
                return warriorType.warrior;
            }
        }
        throw new NullPointerException("Сущности воина с таким названием не существует.");
    }
}
