package entity;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tower {
    private final Set<Floor> floors;

    public Tower(int floorCapacity) {
        floors = generateFloors(floorCapacity);
    }

    public Set<Floor> getFloors() {
        return floors;
    }

    private Set<Floor> generateFloors(int floorCapacity) {
        return Stream.generate(Floor::new).limit(floorCapacity).collect(Collectors.toSet());
    }
}
