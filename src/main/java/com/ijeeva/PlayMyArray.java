package com.ijeeva;

import com.ijeeva.bank.entities.Account;

public class PlayMyArray {

    public static void main(String[] args) {
        Integer[] nos = {5, 4, 3, 6, 7, 8};
        MyArray<Integer> m1 = new MyArray<>(nos);

        int i = m1.get(1);
        System.out.println(i);

        Account[] accounts = {
                new Account("Savings", "325345dfdsf", 9000),
                new Account("Current", "1234", 8000),
                new Account("Savings", "98787DSF", 5600)
        };
        MyArray<Account> m2 = new MyArray<>(accounts);

        Account a = m2.get(2);

        System.out.println(i);
        System.out.println(a);

        m1.printAll();
    }
}
