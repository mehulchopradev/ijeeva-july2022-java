package com.ijeeva;

import com.ijeeva.college.entities.Address;
import com.ijeeva.college.entities.Learner;
import com.ijeeva.college.entities.Professor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {

    @Test
    void test_subclassobjects() {
        Learner l1 = new Learner("mehul", 'm', 10, 90,
                new Address("IN", "MH", 400053));

        String[] subjects = {"Physics", "Chemistry"};
        Professor p1 = new Professor("jane", 'f', subjects,
                new Address("USA", "MI", 3456));

        assertEquals("mehul", l1.getName());
        assertEquals("jane", p1.getName());
    }

    @Test
    void test_get_details() {
        Learner l1 = new Learner("mehul", 'm', 10, 90,
                new Address("IN", "MH", 400053));
        assertEquals("Name: mehul\nGender: m\nRoll: 10", l1.getDetails());

        String[] subjects = {"Physics", "Chemistry"};
        Professor p1 = new Professor("jane", 'f', subjects,
                new Address("USA", "MI", 3456));
        assertEquals("Name: jane\nGender: f", p1.getDetails());

        int i = 90;

        System.out.println(l1);
        // Internally
        // System.out.println(l1.toString());

        System.out.println(p1);
        System.out.println(i);
    }
}
