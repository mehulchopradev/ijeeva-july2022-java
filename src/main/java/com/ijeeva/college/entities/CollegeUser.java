package com.ijeeva.college.entities;

public class CollegeUser {

    private String name;

    private char gender;

    private Address address;

    public CollegeUser(String name, char gender, Address address) {
        // this -> Learner object, Professor object
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // final method cannot be overriden further, but can be inherited further
    // try marking getDetails as final and see the error in the Learner class
    public String getDetails() {
        // this -> Learner, Professor
        return String.format("Name: %s\nGender: %s", this.name, this.gender);
    }

    @Override
    public String toString() {
        return "CollegeUser{" +
                "name='" + this.name + '\'' +
                ", gender=" + this.gender +
                '}';
    }
}
