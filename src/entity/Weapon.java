package entity;

import java.util.Random;

public class Weapon implements Item {
    private final int damage;

    public Weapon() {
        damage = new Random().nextInt(5);
    }

    @Override
    public String getInfo(Warrior warrior) {
        return "Непонятное оружие, что удобно лежит в руке увеличивает итоговый урон до " + damage + warrior.attackDamage + " урона.";
    }
}
