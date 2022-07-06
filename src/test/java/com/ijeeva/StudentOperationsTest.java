package com.ijeeva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentOperationsTest {

    @Test
    void getDetails() {
        String name = "mehul";
        char gender = 'm';
        int roll = 10;
        float marks = 90;
        String expected = "Name: " + name + "\nGender: " + gender + "\nRoll: " + roll + "\nMarks: " + marks;

        String actual = StudentOperations.getDetails(name, gender, roll, marks);
        assertEquals(expected, actual);

    }
}