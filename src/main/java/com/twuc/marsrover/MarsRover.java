package com.twuc.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void execute(String actions) {
        for (char action : actions.toCharArray()) {
            executeOneAction(String.valueOf(action));
        }
    }

    private void executeOneAction(String action) {
        switch (action) {
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            case "M":
                move();
                break;
        }
    }

    private void move() {
        switch (direction) {
            case "N":
                this.y += 1;
                break;
            case "W":
                this.x -= 1;
                break;
            case "S":
                this.y -= 1;
                break;
            case "E":
                this.x += 1;
                break;
        }
    }

    private List<String> directions = Arrays.asList("N", "E", "S", "W");

    private void turnLeft() {
        int i = directions.indexOf(this.direction);
        if (i - 1 < 0) {
            i += directions.size();
        }
        this.direction = directions.get(i - 1);
    }

    private void turnRight() {
        int i = directions.indexOf(this.direction);
        if (i + 1 >= directions.size()) {
            i -= directions.size();
        }
        this.direction = directions.get(i + 1);
    }
}
