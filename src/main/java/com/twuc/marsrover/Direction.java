package com.twuc.marsrover;

import java.util.Arrays;
import java.util.List;

public enum Direction {
    N, E, S, W;

    public Direction turnRight() {
        List<Direction> directions = Arrays.asList(Direction.values());
        int currentIndex = directions.indexOf(Direction.valueOf(this.name()));
        int index = (currentIndex + 1) % directions.size();
        return directions.get(index);
    }

    public Direction turnLeft() {
        List<Direction> directions = Arrays.asList(Direction.values());
        int currentIndex = directions.indexOf(Direction.valueOf(this.name()));
        int index = (currentIndex - 1 + directions.size()) % directions.size();
        return directions.get(index);
    }
}
