package com.ijeeva;

import java.util.ArrayList;
import java.util.HashSet;

public class PlayHashSet {

    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("banana");

        System.out.println(fruits);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(5);
        marks.add(4);
        marks.add(7);
        marks.add(3);
        marks.add(2);
        marks.add(5);
        marks.add(6);
        marks.add(7);
        marks.add(5);

        System.out.println(marks);
        HashSet<Integer> s2 = new HashSet<>(marks);
        System.out.println(s2);
    }

}
