package com.netcracker.figures;

import java.util.Objects;

public class Rectangle extends Figure{

    private float length = 1.0f;
    private float width = 1.0f;


    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length) {
        this.length = length;
    }


    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return rectangle.length == this.length && rectangle.width == this.width;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + (int) width;
        result = 31 * result + (int) length;
        return result;
    }
}
