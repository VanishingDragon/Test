package com.example.poly.myapplication;

/**
 * Created by Poly on 31/1/2561.
 */

public class Calculator {

    public int plus(int x , int y) {

        return x + y;

    }

    public int minus(int x , int y) {

        return x - y;

    }

    public int multiply(int x , int y) {

        return x * y;

    }

    public int divide(int x , int y) {
        if (y == 0) {

            return 0;

        } else {

            return x / y;

        }

    }

}
