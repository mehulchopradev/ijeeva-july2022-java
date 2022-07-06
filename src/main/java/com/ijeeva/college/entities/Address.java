package com.ijeeva.college.entities;

public class Address {

    public String country;
    public String state;
    public int pincode;

    public Address(String country, String state, int pincode) {
        this.country = country;
        this.state = state;
        this.pincode = pincode;
    }

    String getDetails() {
        // this - Address object
        return String.format(
                "\nAddress details\nCountry: %s\nState: %s\nPincode: %s",
                this.country, this.state, this.pincode
        );
    }
}
