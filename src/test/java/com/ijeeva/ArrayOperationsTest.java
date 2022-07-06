package com.ijeeva;

import com.ijeeva.college.entities.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void average() {
        int[] nos = {4,5,6,3,8};
        double expected = 5.2;
        double actual = ArrayOperations.average(nos);
        assertEquals(expected, actual);
    }

    @Test
    void average_students() {
        Student[] students = {
                new Student("mehul", 'm', 10, 90),
                new Student("jane", 'f', 11, 78),
                new Student("jill", 'f', 13, 67)
        };
        double expected = 78.33333333333333;
        double actual = ArrayOperations.average(students);
        assertEquals(expected, actual);
    }
}