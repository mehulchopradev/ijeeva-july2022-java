package com.ijeeva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        // test data
        var length = 5;
        var breadth = 3;
        var expected = 15;

        // test steps
        var actual = Rectangle.area(length, breadth);

        // test assertions
        assertEquals(expected, actual);
    }

    @Test
    void perimeter() {
        // test data
        var length = 5;
        var breadth = 3;
        var expected = 16;

        var actual = Rectangle.perimeter(length, breadth);

        assertEquals(expected, actual);
    }
}