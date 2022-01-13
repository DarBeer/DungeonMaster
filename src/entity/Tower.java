package entity;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tower {
    private final Set<Floor> floors;

    public Tower(int capacity) {
        floors = generateFloors(capacity);
    }

    private Set<Floor> generateFloors(int capacity) {
        return Stream.generate(Floor::new).limit(capacity).collect(Collectors.toSet());
    }
}
