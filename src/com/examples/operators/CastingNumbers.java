package com.examples.operators;

import static com.examples.util.Print.print;

public class CastingNumbers {//Усечение чисел
    //что происходит при приведении float или double при приведении к целочисленным значениям?
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("(int)above: " + (int)above);
        print("(int)below: " + (int)below);
        print("(int)fabove: " + (int)fabove);
        print("(int)fbelow: " + (int)fbelow);
    }
}
