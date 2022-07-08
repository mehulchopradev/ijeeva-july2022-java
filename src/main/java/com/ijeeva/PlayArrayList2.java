package com.ijeeva;

import com.ijeeva.college.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayArrayList2 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("mehul", 'm', 10, 90));
        students.add(new Student("jane", 'f', 12, 75));
        students.add(new Student("jill", 'f', 15, 89));
        students.add(new Student("rahul", 'm', 20, 100));

        int roll;
        try (Scanner scanner = new Scanner(System.in)) {
            roll = scanner.nextInt();
        }

        // will use the equals method overriden in the Student class
        if(students.contains(new Student("NA", 'm', roll, 0))) {
            System.out.println("Student found");
        } else {
            System.out.println("Student not found");
        }
        /* boolean isFound = false;
        for (Student student : students) {
            if (student.getRoll() == roll) {
                isFound = true;
                System.out.println("Student found");
                break;
            }
        }

        if (!isFound) {
            System.out.println("Student not found");
        } */
    }
}
