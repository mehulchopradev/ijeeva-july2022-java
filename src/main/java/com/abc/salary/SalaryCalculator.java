package com.abc.salary;

import com.abc.salary.entities.SalariedIndividual;

public class SalaryCalculator {

    public static double calculate(SalariedIndividual si) {
        int noOfDays = si.getDaysWorked();
        int costPerDay = si.getDailyCost();

        int totalCost = noOfDays * costPerDay;
        double tds = 0.1 * totalCost;
        int professionalTax = 200;
        return totalCost - tds - professionalTax;
    }
}
