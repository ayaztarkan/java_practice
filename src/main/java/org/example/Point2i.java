package org.example;

public class Point2i {
    int x;
    int y;

    public static void main(String[] args) {
        Point2i p = new Point2i(5, 5);
        System.out.println(p);
    }

    public Point2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*@Override
    public String toString() {
        return "X: " + x + " Y: " + y;
    }*/

}

