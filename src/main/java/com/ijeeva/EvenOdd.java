package com.ijeeva;

public class EvenOdd {

    static boolean isEven(int n) {
       return n % 2 == 0;
    }

    static String evenOdd(int n) {
        /* String result;
        if (n % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        return result; */

        /* if (n % 2 == 0) {
            return "even";
        }
        return "odd"; */
        return n % 2 == 0 ? "even" : "odd"; // ternary operator
    }
}
