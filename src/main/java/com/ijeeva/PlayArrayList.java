package com.ijeeva;

import java.util.ArrayList;

public class PlayArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("porshe");
        cars.add("mercedes");
        System.out.println(cars);

        cars.add(1, "bmw");
        System.out.println(cars);

        System.out.println(cars.get(0));
        System.out.println(cars.get(cars.size() - 1));

        cars.set(1, "i20");
        System.out.println(cars);

        System.out.println(cars.remove(cars.size() - 1)); // this will always remove the last element from list
        System.out.println(cars);

        cars.remove("porshe");
        System.out.println(cars);

        ArrayList<String> otherCars = new ArrayList<>();
        otherCars.add("i10");
        otherCars.add("kia");
        otherCars.add("brezza");

        cars.addAll(otherCars);
        System.out.println(cars);

        System.out.println("****** all the array list elements **********");
        for(String car : cars) {
            System.out.println(car.toUpperCase());
        }

        System.out.println(cars.contains("kia"));
        System.out.println(cars.contains("mercedes"));
    }
}
