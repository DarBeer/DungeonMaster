package entity;

import java.util.Random;

public class Weapon implements Item {
    private int damage;

    public Weapon() {
        damage = new Random().nextInt(5);
    }

    @Override
    public String getInfo() {
        return "Непонятное оружие, что удобно лежит в руке на + " + damage + " урона.";
    }
}
