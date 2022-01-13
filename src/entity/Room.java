package entity;

import java.util.Set;

public abstract class Room {
    protected Set<Enemy> enemies;
    protected Chest chest;

    public Set<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(Set<Enemy> enemies) {
        this.enemies = enemies;
    }

    public Chest getChest() {
        return chest;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }
}
