package com.ijeeva.bank.entities;

import com.ijeeva.bank.exceptions.MinBalException;

public class Account {

    private String accType;

    private String accNumber;

    private double balance;

    public Account(String accType, String accNumber, double balance) {
        this.accType = accType;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amt) throws MinBalException {
        if (amt <= 0) {
            throw new IllegalArgumentException("Amt to withdraw cannot be negative or 0");
        }
        if (this.balance - amt < 1000) {
            throw new MinBalException("Min bal of 1000 to be maintained");
        }
        this.balance = this.balance - amt;
        return this.balance;
    }

    public double deposit(double amt) {
        this.balance = this.balance + amt;
        return this.balance;
    }
}
