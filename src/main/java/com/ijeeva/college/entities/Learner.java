package com.ijeeva.college.entities;

public class Learner extends CollegeUser {

    private int roll;
    private float marks;

    public Learner(String name, char gender, int roll, float marks, Address address) {
        // this -> Learner object
        super(name, gender, address);
        // Internally CollegeUser(name, gender, address, this)
        this.roll = roll;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String getDetails() {
        return String.format("%s\nRoll: %s",
                super.getDetails(), this.getRoll());
    }
}
