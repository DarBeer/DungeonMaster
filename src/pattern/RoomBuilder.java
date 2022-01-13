package pattern;

import entity.Chest;
import entity.Enemy;
import entity.Room;
import helper.RoomTypeEnum;

import javax.naming.NameNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RoomBuilder {
    private Room room;

    public static RoomBuilder newBuilder() {
        return new RoomBuilder();
    }

    public RoomBuilder begin(RoomTypeEnum roomType) {
        room = RoomTypeEnum.getByTypeName(roomType.getTypeName());
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
        List<RoomTypeEnum> rooms = Arrays.asList(RoomTypeEnum.values());
        RoomTypeEnum randomType = rooms.get(new Random().nextInt(rooms.size()));

        Room room = RoomTypeEnum.getByTypeName(randomType.getTypeName());

        Chest chest = new Chest();

        room.setChest(chest);
        return room;
    }

    public RoomBuilder clear() {
        room.setEnemies(null);
        room.setChest(null);
        return this;
    }
}
