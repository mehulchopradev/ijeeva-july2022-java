package com.ijeeva;

import java.util.Arrays;
import java.util.List;

public class PlayArrayList3 {

    public static void main(String[] args) {
        List<Integer> nos =  Arrays.asList(5, 6, 3, 2, 7, 8, 4, 3, 1);

        System.out.println("********* Print all elements from nos ***********");
        // print all the even numbers from the above nos list
        nos.forEach(t -> {
            if (t % 2 == 0) {
                System.out.println(t);
            }
        });

        System.out.println("******* Print all odd numbers more than 1 from nos ********");
        nos.forEach(t -> {
            if (t % 2 != 0 && t > 1) {
                System.out.println(t);
            }
        });
    }
}
