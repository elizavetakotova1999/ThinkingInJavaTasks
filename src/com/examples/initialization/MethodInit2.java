package com.examples.initialization;
//При инициализации переменной через метод, метод может иметь аргументы,
// но в качестве аргументов нельзя использовать неинициализированные члены класса

//Правильный пример:

public class MethodInit2 {
    int i = f();
    int j = g(i);
    int f() {
        return 11;
    }
    int g(int n) {
        return n * 10;
    }

    public static void main(String[] args) {
        MethodInit2 m2 = new MethodInit2();
        System.out.println("i = " + m2.i + ", j = " + m2.j);
    }
}
