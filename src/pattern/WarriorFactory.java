package pattern;

import helper.WarriorTypeEnum;
import entity.Boss;
import entity.Enemy;
import entity.Player;
import entity.Warrior;

import java.util.HashSet;
import java.util.Set;

public class WarriorFactory {
    private final Set<Warrior> warriors = new HashSet<>();

    {
        warriors.add(new Boss());
        warriors.add(new Enemy());
        warriors.add(new Player());
    }

    public Warrior create(WarriorTypeEnum warriorType) {
        for (Warrior warrior : warriors) {
            if (warrior.getClass().getTypeName().equals(warriorType.getTypeName())) {
                return warrior;
            }
        }
        throw new NoClassDefFoundError("Сущность не найдена.");
    }
}
