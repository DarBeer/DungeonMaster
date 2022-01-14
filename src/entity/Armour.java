package entity;

import java.util.Random;

public class Armour implements Item {
    private final int health;

    public Armour() {
        health = new Random().nextInt(5);
    }

    @Override
    public String getInfo(Warrior warrior) {
        return "Броня увеличила итоговое здоровье до " + health + warrior.health + " здоровья.";
    }
}
