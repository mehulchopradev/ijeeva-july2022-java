package com.ijeeva;

import com.ijeeva.bank.entities.Account;
import com.ijeeva.bank.exceptions.MinBalException;

public class CreateAccount {

    public static void main(String[] args) {
        final Account account = new Account("Savings", "ABC345", 10000);
        System.out.println(account.deposit(1000));

        try {
            double bal = account.withdraw(10000000);
            System.out.println(bal);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (MinBalException e) {
            e.printStackTrace();
        }

        // account is final cannot be ressigned a value
        // account = new Account("Current", "DFGD$%46", 1000);
    }
}
