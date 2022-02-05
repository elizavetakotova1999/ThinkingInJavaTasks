package com.examples.initialization;
//см. MethodInit3

public class MethodInit3 {
    //Недопустимая инициализация переменной через метод, в котором не инициализированы члены класса
    // int j = g(i); // Недопустимая опережающая ссылка
    int i = f();
    int f() {
        return 12;
    }
    int g(int n) {
        return n * 10;
    }

    public static void main(String[] args) {
        System.out.println(new MethodInit3().i);
    }
}
