package com.ijeeva.geometry.entities;

import com.abc.geometry.entities.Shape;

// Developer Y
public class Rectangle extends Shape {

    private float length;
    private float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    @Override
    public float area() {
        return this.length * this.breadth;
    }

    @Override
    public float perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
