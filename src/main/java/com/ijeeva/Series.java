package com.ijeeva;

public class Series {

    static String evenSeries(int n) {
        // for loop
        String result = "";
        for(int i = 0; i <= n; i = i + 1) {
            if (i % 2 == 0) {
                result = result + i;
                if (i < n - 1) {
                    result = result + ',';
                }
            }
        }

        return result;

        // while loop
        /* String result = "";
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                result = result + i;
                if (i < n - 1) {
                    result = result + ',';
                }
            }
            i = i + 1;
        }

        return result; */
    }
}
