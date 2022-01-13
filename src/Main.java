import helper.WarriorTypeEnum;
import entity.Warrior;
import pattern.WarriorFactory;

import javax.naming.NameNotFoundException;

public class Main {
    public static void main(String[] args) {
        WarriorFactory factory = new WarriorFactory();
        Warrior warrior = factory.createWarrior(WarriorTypeEnum.PLAYER);
        int resultHealth = warrior.bonk(100, 1);
        System.out.println(resultHealth);
    }
}
