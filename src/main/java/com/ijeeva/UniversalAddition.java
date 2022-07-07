package com.ijeeva;

import com.ijeeva.bank.entities.Account;
import com.ijeeva.college.entities.Student;

import java.util.Random;

public class UniversalAddition {

    // T can be any Object
    public static <T> T surpriseMe(T[] elements) {
        // random number between 0 and elements.length - 1
        Random random = new Random();
        int index = random.nextInt(elements.length);
        return elements[index];
    }

    public static void main(String[] args) {
        Integer[] nos = {5, 6, 3, 4, 8, 9};
        int n = surpriseMe(nos);
        System.out.println(n);

        String[] cars = {"audi", "porshe", "bmw", "mercedes"};
        String c = surpriseMe(cars);
        System.out.println(c);

        Account[] accounts = {
                new Account("Savings", "325345dfdsf", 9000),
                new Account("Current", "1234", 8000),
                new Account("Savings", "98787DSF", 5600)
        };
        Account a = surpriseMe(accounts);
        System.out.println(a);
    }
}
