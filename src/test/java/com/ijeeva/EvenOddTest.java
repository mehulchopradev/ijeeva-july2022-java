package com.ijeeva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void isEven_for_odd_number() {
        var n = 9;
        var expected = false;
        var actual = EvenOdd.isEven(n);
        assertEquals(expected, actual);
    }

    @Test
    void isEven_for_even_number() {
        var n = 12;
        var expected = true;
        var actual = EvenOdd.isEven(n);
        assertEquals(expected, actual);
    }

    @Test
    void evenOdd_for_even_number() {
        var n = 12;
        var expected = "even";
        var actual = EvenOdd.evenOdd(n);
        assertEquals(expected, actual);
    }

    @Test
    void evenOdd_for_odd_number() {
        var n = 11;
        var expected = "odd";
        var actual = EvenOdd.evenOdd(n);
        assertEquals(expected, actual);
    }
}