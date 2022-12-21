package com.twuc.marsrover;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public MarsRover(int x, int y, String direction) {

        this.x = x;
        this.y = y;
        this.direction = Direction.valueOf(direction);
    }

    public void execute(String actions) {
        for (char action : actions.toCharArray()) {
            executeOneAction(String.valueOf(action));
        }
    }

    private void executeOneAction(String action) {
        switch (action) {
            case "L":
                this.direction = this.direction.turnLeft();
                break;
            case "R":
                this.direction = this.direction.turnRight();
                break;
            case "M":
                move();
                break;
        }
    }

    private void move() {
        switch (this.direction.name()) {
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

    public String location() {
        return this.x + "," + this.y + "," + this.direction;
    }
}
