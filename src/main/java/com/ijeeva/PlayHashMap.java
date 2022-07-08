package com.ijeeva;

import com.ijeeva.college.entities.Student;

import java.util.HashMap;
import java.util.Scanner;

public class PlayHashMap {

    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(10, new Student("mehul", 'm', 10, 90));
        map.put(12, new Student("jane", 'f', 12, 75));
        map.put(15, new Student("jill", 'f', 15, 89));
        map.put(20, new Student("rahul", 'm', 20, 100));

        int roll;
        try (Scanner scanner = new Scanner(System.in)) {
            roll = scanner.nextInt();
        }

        Student student = map.get(roll);
        if (student != null) {
            System.out.println(student.getDetails());
        } else {
            System.out.println("Student not found");
        }

        System.out.println(map.keySet());

        /* if(map.containsKey(roll)) {
            System.out.println("Student found");
        } else {
            System.out.println("Student not found");
        } */
    }
}
