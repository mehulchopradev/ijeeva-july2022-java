package com.ijeeva.college.entities;

public class Professor extends CollegeUser {

    private String[] subjects;

    public Professor(String name, char gender, String[] subjects, Address address) {
        // this -> Professor object
        super(name, gender, address);
        // Internally
        // CollegeUser(name, gender, address, this)
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}
