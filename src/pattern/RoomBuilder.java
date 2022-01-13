package pattern;

import entity.Chest;
import entity.Enemy;
import entity.Room;
import helper.RoomTypeEnum;

import javax.naming.NameNotFoundException;
import java.util.Objects;
import java.util.Set;

public class RoomBuilder {
    private Room room;

    public static RoomBuilder newBuilder() {
        return new RoomBuilder();
    }

    public RoomBuilder begin(RoomTypeEnum roomType) {
        try {
            room = RoomTypeEnum.getByTypeName(roomType.getTypeName());
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return this;
    }

    public RoomBuilder chest(Chest chest) {
        room.setChest(chest);
        return this;
    }

    public RoomBuilder enemies(Set<Enemy> enemies) {
        room.setEnemies(enemies);
        return this;
    }

    public Room build() {
        return Objects.requireNonNull(room, "Сущность комнаты была собрано неверно.");
    }

    public static Room buildRandom() {
        return null;
    }

    public RoomBuilder clear() {
        room.setEnemies(null);
        room.setChest(null);
        return this;
    }
}
