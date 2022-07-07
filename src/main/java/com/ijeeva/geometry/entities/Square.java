package com.ijeeva.geometry.entities;

import com.abc.geometry.entities.Shape;

// Developer X
public class Square extends Shape {

    private float side;

    public Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public float area() {
        // this
        return this.side * this.side;
    }

    public float perimeter() {
        // this
        return 4 * this.side;
    }
}
