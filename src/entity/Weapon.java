package entity;

public class Weapon implements Item {
    private int damage;

    @Override
    public String getInfo() {
        return String.valueOf(damage);
    }
}
