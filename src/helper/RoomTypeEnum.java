package helper;

import entity.*;

import javax.naming.NameNotFoundException;

public enum RoomTypeEnum {
    BOSS(new BossRoom()),
    ENEMY(new EnemyRoom()),
    CHEST(new ChestRoom());

    private final Room room;

    RoomTypeEnum(Room room) {
        this.room = room;
    }

    public String getTypeName() {
        return room.getClass().getTypeName();
    }

    public static Room getByTypeName(String typeName) throws NameNotFoundException {
        for (RoomTypeEnum roomType: RoomTypeEnum.values()) {
            if (roomType.getTypeName().equals(typeName)) {
                return roomType.room;
            }
        }
        throw new NameNotFoundException("Сущности комнаты с таким названием не существует.");
    }
}
