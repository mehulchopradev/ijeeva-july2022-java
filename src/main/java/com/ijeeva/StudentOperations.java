package com.ijeeva;

public class StudentOperations {

    static String getDetails(String name, char gender, int roll, float marks) {
        return "Name: " + name + "\nGender: " + gender + "\nRoll: " + roll + "\nMarks: " + marks;
    }

    static char getGrade(float marks) {
        char grade;

        if (marks > 100 || marks < 0) {
            grade = 'I';
        } else if (marks >= 70) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
