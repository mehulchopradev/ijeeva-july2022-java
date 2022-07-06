package com.ijeeva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {

    @Test
    void evenSeries() {
        var n = 10;
        var expected = "0,2,4,6,8,10";

        var actual = Series.evenSeries(n);
        assertEquals(expected, actual);
    }

    @Test
    void evenSeries_for_odd_n() {
        var n = 9;
        var expected = "0,2,4,6,8";

        var actual = Series.evenSeries(n);
        assertEquals(expected, actual);
    }
}