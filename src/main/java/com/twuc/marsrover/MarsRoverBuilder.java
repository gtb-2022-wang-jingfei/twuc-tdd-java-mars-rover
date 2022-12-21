package com.twuc.marsrover;

public class MarsRoverBuilder {
    public static MarsRover build(String input) {
        // input: 0,0,N
        String[] split = input.split(",");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        String direction = split[2];
        return new MarsRover(x, y, direction);
    }
}
