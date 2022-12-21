package com.twuc.marsrover;

public class MarsBuilder {
    public static Mars build(String input) {
        // input: 5,5
        String[] split = input.split(",");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        return new Mars(x,y);
    }
}
