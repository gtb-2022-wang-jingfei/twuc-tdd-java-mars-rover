package com.twuc.marsrover;

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

    private void turnLeft() {
        switch (direction) {
            case "N":
                this.direction = "W";
                break;
            case "W":
                this.direction = "S";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                this.direction = "E";
                break;
            case "E":
                this.direction = "S";
                break;
            case "S":
                this.direction = "W";
                break;
            case "W":
                this.direction = "N";
                break;
        }
    }
}
