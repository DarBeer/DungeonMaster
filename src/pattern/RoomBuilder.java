package pattern;

import entity.Chest;
import entity.Enemy;
import entity.Room;

import java.util.Objects;
import java.util.Set;

public class RoomBuilder {
    private Room room;

    public RoomBuilder(Room room) {
        this.room = room;
    }

    public RoomBuilder chest(Chest chest) {
        room.setChest(chest);
        return this;
    }

    public RoomBuilder enemies(Set<Enemy> enemies) {
        room.setEnemies(enemies);
        return this;
    }

    public RoomBuilder clear() {
        room.setEnemies(null);
        room.setChest(null);
        return this;
    }

    public Room build() {
        return Objects.requireNonNull(room, "Сущность Room была собрано неверно.");
    }

    public static Room buildRandom() {
        return null;
    }
}
