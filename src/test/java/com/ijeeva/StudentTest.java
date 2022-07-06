package com.ijeeva;

import com.ijeeva.college.entities.Address;
import com.ijeeva.college.entities.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void init() {
        Student.count = 0;
    }

    @Test
    void create_student_objects() {
        String s = "mehul chopra";
        var s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1);
        System.out.println(s2);

        assertNotEquals(s1, s2);
        assertEquals("NA", s1.getName());
        assertEquals(0, s1.getRoll());
        assertEquals(0.0, s1.getMarks());
    }

    @Test
    void setting_object_attributes() {
        var s1 = new Student();
        s1.setName("mehul");
        s1.setRoll(10);
        s1.setMarks(90);
        s1.setGender('m');

        assertEquals("mehul", s1.getName());
        assertEquals(10, s1.getRoll());
        assertEquals(90, s1.getMarks());
        assertEquals('m', s1.getGender());
    }

    @Test
    void get_details() {
        var s1 = new Student();
        s1.setName("mehul");
        s1.setRoll(10);
        s1.setMarks(90);
        s1.setGender('m');

        String expected = "Name: " + s1.getName() + "\nGender: "
                + s1.getGender() + "\nRoll: " + s1.getRoll() + "\nMarks: " + s1.getMarks();
        String actual = s1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void get_details_with_parameterized_constructor() {
        var s1 = new Student("mehul", 'm', 10, 67);

        String expected = "Name: " + s1.getName() + "\nGender: "
                + s1.getGender() + "\nRoll: " + s1.getRoll() + "\nMarks: " + s1.getMarks();
        String actual = s1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void test_static_count() {
        assertEquals(0, Student.count);
        var s1 = new Student();
        var s2 = new Student("mehul", 'm', 10, 67);

        assertEquals(2, Student.count);
    }

    @Test
    void test_static_method() {
        String name = "mehul";
        char gender = 'm';
        int roll = 10;
        float marks = 90;
        Student actual = Student.createInstance(name, gender, roll, marks);
        assertEquals(name, actual.getName());
        assertEquals(gender, actual.getGender());
    }

    @Test
    void test_student_address() {
        String name = "mehul";
        char gender = 'm';
        int roll = 10;
        float marks = 90;
        Address address = new Address("IN", "MH", 400053);

        Student actual = new Student(name, gender, roll, marks, address);
        assertEquals("IN", actual.getAddress().country);
        assertEquals("MH", actual.getAddress().state);
    }

    @Test
    void get_details_when_address_present() {
        String name = "mehul";
        char gender = 'm';
        int roll = 10;
        float marks = 90;
        Address address = new Address("IN", "MH", 400053);

        Student student = new Student(name, gender, roll, marks, address);

        String expected = "Name: " + name + "\nGender: "
                + gender + "\nRoll: " + roll + "\nMarks: " + marks
                + "\nAddress details\nCountry: IN\nState: MH\nPincode: 400053";
        String actual = student.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void play_with_roll() {
        var s1 = new Student();
        // s1.roll = -78;
        s1.setRoll(-78);
        assertEquals(0, s1.getRoll());

        s1.setRoll(23);
        assertEquals(23, s1.getRoll());
    }

    @Test
    void play_with_roll_2() {
        var s1 = new Student("mehul", 'm', -10, 67);
        assertEquals(0, s1.getRoll());
    }
}