package entity;

public class Armour implements Item {
    private int health;

    @Override
    public String getInfo() {
        return String.valueOf(health);
    }
}
