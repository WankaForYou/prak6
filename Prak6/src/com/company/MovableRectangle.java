package com.company;

public class MovableRectangle extends Rectangle implements Movable{

    MovablePoints movablePointsUpLeft;
    MovablePoints movablePointsUpRight;
    MovablePoints movablePointsDownRight;
    MovablePoints movablePointsDownLeft;


    public MovableRectangle(Point pointUpLeft, Point pointUpRight, Point pointDownRight, Point pointDownLeft) {
        super(pointUpLeft, pointUpRight, pointDownRight, pointDownLeft);
        movablePointsUpLeft = new MovablePoints(pointUpLeft.getX(),pointUpLeft.getY());
        movablePointsUpRight = new MovablePoints(pointUpRight.getX(),pointUpRight.getY());
        movablePointsDownLeft = new MovablePoints(pointDownLeft.getX(),pointDownLeft.getY());
        movablePointsDownRight = new MovablePoints(pointDownRight.getX(),pointDownRight.getY());

    }

    @Override
    public void move(int x, int y) {
        movablePointsUpLeft.move(x,y);
        movablePointsUpRight.move(x,y);
        movablePointsDownRight.move(x,y);
        movablePointsDownLeft.move(x,y);
    }

    public MovablePoints getMovablePointsUpLeft() {
        return movablePointsUpLeft;
    }

    public void setMovablePointsUpLeft(MovablePoints movablePointsUpLeft) {
        this.movablePointsUpLeft = movablePointsUpLeft;
    }

    public MovablePoints getMovablePointsUpRight() {
        return movablePointsUpRight;
    }

    public void setMovablePointsUpRight(MovablePoints movablePointsUpRight) {
        this.movablePointsUpRight = movablePointsUpRight;
    }

    public MovablePoints getMovablePointsDownRight() {
        return movablePointsDownRight;
    }

    public void setMovablePointsDownRight(MovablePoints movablePointsDownRight) {
        this.movablePointsDownRight = movablePointsDownRight;
    }

    public MovablePoints getMovablePointsDownLeft() {
        return movablePointsDownLeft;
    }

    public void setMovablePointsDownLeft(MovablePoints movablePointsDownLeft) {
        this.movablePointsDownLeft = movablePointsDownLeft;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "movablePointsUpLeft=" + movablePointsUpLeft +
                ", movablePointsUpRight=" + movablePointsUpRight +
                ", movablePointsDownRight=" + movablePointsDownRight +
                ", movablePointsDownLeft=" + movablePointsDownLeft +
                '}';
    }
}
