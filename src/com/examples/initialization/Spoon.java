package com.examples.initialization;
//Явная инициализация статических членов
public class Spoon {
    static int i;
    static {//статический блок
        i = 47;
    }

    public static void main(String[] args) {
        System.out.println(Spoon.i);
    }
}
