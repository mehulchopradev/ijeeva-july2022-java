package com.ijeeva.geometry.entities;

import com.abc.geometry.Statistics;
import com.abc.geometry.entities.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void area() {
        Square s1 = new Square(5);
        assertEquals(25, s1.area());
    }

    @Test
    void perimeter() {
        Square s2 = new Square(6);
        assertEquals(24, s2.perimeter());
    }

    @Test
    void test_statistics() {
        Square s2 = new Square(6);
        String actual = Statistics.calculate(s2);
        String expected = "******\nArea is 36.0\nPerimeter is 24.0\n******";
        assertEquals(expected, actual);

        Rectangle rectangle = new Rectangle(5, 3);
        actual = Statistics.calculate(rectangle);
        expected = "******\nArea is 15.0\nPerimeter is 16.0\n******";
        assertEquals(expected, actual);

        // new Shape(); // cannot create object of an abstract class
    }
}