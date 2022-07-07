package com.abc.geometry;


import com.abc.geometry.entities.Shape;

public class Statistics {

    public static String calculate(Shape shape) {
        float a = shape.area();
        float p = shape.perimeter();

        return String.format(
                "******\nArea is %s\nPerimeter is %s\n******",
                a, p
        );
    }
}
