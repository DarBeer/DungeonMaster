package entity;

import helper.RoomTypeEnum;
import pattern.RoomBuilder;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Floor {
    private final Set<Room> rooms;

    public Floor() {
        rooms = generateRandomRooms();
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    private Set<Room> generateRandomRooms() {
        Set<Room> rooms = Stream.generate(RoomBuilder::buildRandom).limit(4).collect(Collectors.toSet());

        Room room = RoomBuilder.newBuilder()
                .begin(RoomTypeEnum.BOSS)
                .chest(new Chest())
                .enemies(Collections.singleton(new Boss()))
                .build();

        rooms.add(room);

        return rooms;
    }
}
