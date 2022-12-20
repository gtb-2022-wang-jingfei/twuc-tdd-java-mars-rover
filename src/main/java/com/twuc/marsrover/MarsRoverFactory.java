package com.twuc.marsrover;

public class MarsRoverFactory {
    private static final String SEPARATOR = ",";

    public static Mars buildMars(String input) {
        String[] split = input.split(SEPARATOR);
        return new Mars(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    public static MarsRover buildMarsRover(String input) {
        String[] split = input.split(SEPARATOR);
        return new MarsRover(Integer.parseInt(split[0]), Integer.parseInt(split[1]), split[2]);
    }
}
