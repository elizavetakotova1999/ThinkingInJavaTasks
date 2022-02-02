package com.company.operators;

import static com.company.util.Print.print;

public class ShortCircuit {//Ускоренное вычисление при использовании логических операторов

    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("результат: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("результат: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("результат: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        print("выражение: " + b);
    }
}
