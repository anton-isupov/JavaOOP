package com.netcracker.point;

public class MyPoint {

    int x = 0;
    int y = 0;

    public MyPoint() {
        x = 5;
        y = 5;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] point = new int[2];
        point[0] = getX();
        point[1] = getY();
        return point;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));
    }


    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.getX() - getX(), 2) + Math.pow(another.getY() - getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;
        MyPoint point = (MyPoint) o;
        return point.x == x && point.y == y;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
