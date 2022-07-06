package com.ijeeva;

import com.ijeeva.college.entities.Student;

public class ArrayOperations {

    static double average(int[] elements) {
        double sum = 0;
        /* for (int i = 0; i <= elements.length - 1; i++) {
            sum = sum + elements[i];
        } */

        // enhanced for loop
        for (int element : elements) {
            sum = sum + element;
        }

        return sum / elements.length;
    }

    static double average(Student[] students) {
        double sum = 0;
        /* for (int i = 0; i <= students.length - 1; i++) {
            sum = sum + students[i].marks;
        } */

        for (Student student : students) {
            sum = sum + student.getMarks();
        }

        return sum / students.length;
    }

    static int nextGenAdd(int... elements) {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }

        return sum;
    }
}
