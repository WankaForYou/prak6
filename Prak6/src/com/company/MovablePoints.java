package com.company;

public class MovablePoints extends Point implements Movable{

    public MovablePoints(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        setX(getX()+x);
        setY(getY()+y);
    }



}
