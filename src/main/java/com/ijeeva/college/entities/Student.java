package com.ijeeva.college.entities;

import java.util.Objects;

public class Student {

    // object attributes / instance attributes
    private String name; // default value -- null
    private char gender;
    private int roll; // default value 0
    private float marks; // default value 0.0
    private Address address;

    public static int count;

    public Student() {
        // this() call - first statement
        this("NA", 'm', 0, 0.0f);
    }

    public Student(String name, char gender, int roll, float marks) {
        this(name, gender, roll, marks, null);
    }

    public Student(String name, char gender, int roll, float marks, Address address) {
        Student.count++;
        this.name = name;
        this.setGender(gender);
        this.setRoll(roll);
        this.marks = marks;
        this.address = address;
    }

    public String getDetails() {
        // this -- Current object -- s1, s2, s3
        /* return "Name: " + this.name + "\nGender: " + this.gender + "\nRoll: " + this.roll
                + "\nMarks: " + this.marks; */
        String part1 = String.format("Name: %s\nGender: %s\nRoll: %s\nMarks: %s",
                this.name, this.gender, this.roll, this.marks);
        String part2 = "";
        if (this.address != null) { // null check
            part2 = this.address.getDetails();
        }

        return part1 + part2;
    }

    //Internally
    /* String getDetails(Student this) {

    } */

    public char getGrade() {
        // this -> current object
        char grade;
        var marks = this.marks;
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

    public static Student createInstance(String name, char gender, int roll, float marks) {
        return new Student(name, gender, roll, marks);
    }

    // encapsulation
    public void setRoll(int roll) {
        if (roll > 0) {
            this.roll = roll;
        }
    }

    public int getRoll() {
        return this.roll;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
