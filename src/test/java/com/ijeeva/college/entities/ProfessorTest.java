package com.ijeeva.college.entities;

import com.abc.salary.SalaryCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void test_salary_calculation() {
        String[] subjects = {"Physics"};
        Professor professor = new Professor("mehul", 'm', subjects, null,
                4000, 18);
        double actual = professor.calculate();
        // double actual = SalaryCalculator.calculate(professor);
        assertEquals(64600.0, actual);
    }
}