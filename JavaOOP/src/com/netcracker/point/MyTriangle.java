package com.netcracker.point;

import com.netcracker.figures.Figure;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v2.setX(x2);
        v3.setX(x3);
        v1.setY(y1);
        v2.setY(y2);
        v3.setY(y3);

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    double getPerimetr() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        int sc = v1.getX() * v2.getX() + v1.getY() * v2.getY();
        int sc1 = v2.getX() * v3.getX() + v2.getY() * v3.getY();
        int sc2 = v1.getX() * v3.getX() + v1.getY() * v3.getY();
        if (sc == 0 || sc1 == 0 || sc2 == 0) return "Right";
        if (sc < 0 | sc1 < 0 | sc2 < 0) return "Obtuse";
        return "Acute angle";
    }
    @Override
    public String toString() {
        return "MyTriangle[v1 =" +
                " (" + v1.getX() + " " + v1.getY() + ") " +
                " v2 = (" + v2.getX() + " " + v2.getY() + ") " +
                " v3 = (" + v3.getX() + " " + v3.getY() + ") " +
                " ]";

    }
}
