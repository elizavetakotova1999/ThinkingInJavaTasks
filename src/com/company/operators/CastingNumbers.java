package com.company.operators;

import static com.company.util.Print.print;

public class CastingNumbers {//Округление и усечение
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
