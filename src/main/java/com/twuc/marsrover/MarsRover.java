package com.twuc.marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public MarsRover(int x, int y, String direction) {

        this.x = x;
        this.y = y;
        this.direction = direction;
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
        switch (this.direction) {
            case "N":
                this.y += 1;
                break;
            case "E":
                this.x += 1;
                break;
            case "S":
                this.y -= 1;
                break;
            case "W":
                this.x -= 1;
                break;
        }
    }

    private final List<String> directions = Arrays.asList("N", "E", "S", "W");

    private void turnRight() {
        int currentIndex = directions.indexOf(this.direction);
        int index = (currentIndex + 1) % directions.size();
        this.direction = directions.get(index);
    }

    private void turnLeft() {
        int currentIndex = directions.indexOf(this.direction);
        int index = (currentIndex - 1 + directions.size()) % directions.size();
        this.direction = directions.get(index);
    }

    public String location() {
        return this.x + "," + this.y + "," + this.direction;
    }
}
