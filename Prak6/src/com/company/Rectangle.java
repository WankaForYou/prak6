package com.company;

public class Rectangle {

    Point pointUpLeft = new Point(0,0);
    Point pointUpRight= new Point(0,0);
    Point pointDownRight = new Point(0, 0);
    Point pointDownLeft = new Point(0,0);

    public Point getPointUpLeft() {
        return pointUpLeft;
    }

    public void setPointUpLeft(Point pointUpLeft) {
        this.pointUpLeft = pointUpLeft;
    }

    public Point getPointUpRight() {
        return pointUpRight;
    }

    public void setPointUpRight(Point pointUpRight) {
        this.pointUpRight = pointUpRight;
    }

    public Point getPointDownRight() {
        return pointDownRight;
    }

    public void setPointDownRight(Point pointDownRight) {
        this.pointDownRight = pointDownRight;
    }

    public Point getPointDownLeft() {
        return pointDownLeft;
    }

    public void setPointDownLeft(Point pointDownLeft) {
        this.pointDownLeft = pointDownLeft;
    }

    public Rectangle(Point pointUpLeft, Point pointUpRight, Point pointDownRight, Point pointDownLeft) {
        this.pointUpLeft = pointUpLeft;
        this.pointUpRight = pointUpRight;
        this.pointDownRight = pointDownRight;
        this.pointDownLeft = pointDownLeft;
    }
}
