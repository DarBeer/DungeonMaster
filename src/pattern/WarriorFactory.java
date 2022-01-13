package pattern;

import entity.*;
import helper.WarriorTypeEnum;

import javax.naming.NameNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class WarriorFactory {
    private final Set<Warrior> warriors = new HashSet<>();

    public Warrior createWarrior(WarriorTypeEnum warriorType) {
        return WarriorTypeEnum.getByTypeName(warriorType.getTypeName());
    }
}
