package entity;

import java.util.Random;

public class Armour implements Item {
    private final int health;

    public Armour() {
        health = new Random().nextInt(5);
    }

    @Override
    public String getInfo() {
        return "Броня на +" + health + " здоровья.";
    }
}
