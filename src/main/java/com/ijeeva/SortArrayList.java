package com.ijeeva;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {

    public static void main(String[] args) {
        List<Integer> nos =  Arrays.asList(5, 6, 3, 2, 7, 8, 4, 3, 1);

        // inner class / local class
        /* class DescendingComparator implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }
        nos.sort(new DescendingComparator()); */

        // annonymous inner class
        /* nos.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }); */

        nos.sort((o1, o2) -> o2.compareTo(o1));

        System.out.println(nos);
    }
}
