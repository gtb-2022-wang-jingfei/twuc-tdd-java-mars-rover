package com.twuc.marsrover;

public class MarsRoverBuilder {
    public static MarsRover build(String input) {
        String[] split = input.split(",");
        return new MarsRover(Integer.parseInt(split[0]), Integer.parseInt(split[1]), split[2]);
    }
}
