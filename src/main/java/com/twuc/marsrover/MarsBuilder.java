package com.twuc.marsrover;

public class MarsBuilder {
    public static Mars build(String input) {
        String[] split = input.split(",");
        return new Mars(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }
}
