package com.ijeeva;

import com.ijeeva.college.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayArrayList5 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("mehul", 'm', 10, 90));
        students.add(new Student("jane", 'f', 12, 75));
        students.add(new Student("jill", 'f', 15, 89));
        students.add(new Student("rahul", 'm', 20, 100));

        // create a new list of names of all the male students in the class
        List<String> maleStudents =  students
                .stream()
                .filter(student -> student.getGender() == 'm')
                .map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println(maleStudents);

        // Get names of all students comma separated who have scored greater than 75 marks
        String names = students
                .stream()
                .filter(student -> student.getMarks() > 75)
                .map(student -> student.getName())
                .collect(Collectors.joining(","));
        System.out.println(names);
    }
}
