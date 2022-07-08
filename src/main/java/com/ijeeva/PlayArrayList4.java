package com.ijeeva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayArrayList4 {

    public static void main(String[] args) {
        List<Integer> nos =  Arrays.asList(5, 6, 3, 2, 7, 8, 4, 3, 1);

        // Create a new list containing even elements greater than 2 from the nos list
        // Filtering operation
        // print the new list
        /* List<Integer> evens = new ArrayList<>();
        nos.forEach(t -> {
            if (t % 2 == 0 && t > 2) {
                evens.add(t);
            }
        }); */

        System.out.println("************* New list of evens more than 2 ************");
        // System.out.println(evens);

        // Stream API
        // Stream - low level representation of a collection of data
        // Stream data pipeline
            // Intermediate operations
            // Terminal operation
        /* Stream<Integer> elements =  Stream.of(5, 6, 3, 4, 7, 1);
        Stream<Integer> nosStream = nos.stream();
        String[] cars = {"audi", "mercedes", "bmw"};
        Stream<String> carsStream = Arrays.stream(cars); */

        List<Integer> evens = nos
                .stream()
                .filter(t -> t % 2 == 0 && t > 2)
                .collect(Collectors.toList());
        System.out.println(evens);

        // create a new list containing all the odd numbers less than 7 from the nos list
        List<Integer> odds =  nos
                .stream()
                .filter(t -> t % 2 != 0 && t < 7)
                .collect(Collectors.toList());

        // create a new list containing all elements from nos list, but with their
        // value deducted by 1 (Mapping)
        List<Integer> deductedByOne = nos
                .stream()
                .map(t -> t - 1)
                .collect(Collectors.toList());
        System.out.println(deductedByOne);

        // create a new list containing all the odd numbers squared up and descending order from the nos list
        // Filter + Map
        List<Integer> s2 =  nos
                .stream()
                .filter(t -> t % 2 != 0)
                .map(t -> t * t)
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
        System.out.println(s2);

    }
}
