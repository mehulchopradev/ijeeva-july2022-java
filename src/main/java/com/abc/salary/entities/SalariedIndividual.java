package com.abc.salary.entities;

public interface SalariedIndividual {

    int getDailyCost();

    int getDaysWorked();

    // default methods
    // available only from Java 8 and up
    default double calculate() {
        // this -> Professor object, sub clas object that implements the SalariedIndividual
        int noOfDays = this.getDaysWorked();
        int costPerDay = this.getDailyCost();

        int totalCost = noOfDays * costPerDay;
        double tds = 0.1 * totalCost;
        int professionalTax = 200;
        return totalCost - tds - professionalTax;
    }
}
