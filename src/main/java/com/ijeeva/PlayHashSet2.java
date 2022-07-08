package com.ijeeva;

import java.util.ArrayList;
import java.util.HashSet;

public class PlayHashSet2 {

    public static void main(String[] args) {
        ArrayList<Integer> m1 = new ArrayList<>();
        m1.add(1);
        m1.add(3);
        m1.add(5);
        m1.add(7);

        ArrayList<Integer> m2 = new ArrayList<>();
        m2.add(3);
        m2.add(10);
        m2.add(7);

        // common set of marks that were scored across the two divisions
        HashSet<Integer> s1 = new HashSet<>(m1);
        HashSet<Integer> s2 = new HashSet<>(m2);

        s1.retainAll(s2); // intersection of the two sets
        System.out.println(s1);

        // all the unique marks that were scored across the two divisions
        HashSet<Integer> s3 = new HashSet<>(m1);
        HashSet<Integer> s4 = new HashSet<>(m2);
        s3.addAll(s4);
        System.out.println(s3);
    }
}
