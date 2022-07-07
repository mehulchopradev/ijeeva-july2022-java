package com.ijeeva.college.entities;

import com.abc.salary.entities.SalariedIndividual;

public final class Professor extends CollegeUser implements SalariedIndividual {

    private String[] subjects;

    private int perDayCost;

    private int noOfDaysWorked;

    public Professor(String name, char gender, String[] subjects, Address address) {
        this(name, gender, subjects, address, 0, 0);
    }

    public Professor(String name, char gender, String[] subjects, Address address,
                     int perDayCost, int noOfDaysWorked) {
        // this -> Professor object
        super(name, gender, address);
        // Internally
        // CollegeUser(name, gender, address, this)

        this.subjects = subjects;
        this.perDayCost = perDayCost;
        this.noOfDaysWorked = noOfDaysWorked;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getPerDayCost() {
        return perDayCost;
    }

    public void setPerDayCost(int perDayCost) {
        this.perDayCost = perDayCost;
    }

    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }

    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }

    @Override
    public int getDailyCost() {
        return this.perDayCost;
    }

    @Override
    public int getDaysWorked() {
        return this.noOfDaysWorked;
    }
}
