package com.company;

public class Main {

    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(new Point(10,20),new Point(30,40), new Point(10,20),new Point(20,30));

        movableRectangle.move(10,20);

        System.out.println(movableRectangle);

    }
}
