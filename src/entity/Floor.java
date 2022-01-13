package entity;

import pattern.RoomBuilder;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Floor {
    private Set<Room> rooms = new HashSet<>(5);

    public Floor() {

    }

    private Set<Room> generateRandomRooms() {
        return Stream.generate(RoomBuilder::buildRandom).limit(5).collect(Collectors.toSet());
    }
}
