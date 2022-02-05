package com.examples.initialization;
//Начальное значение может задаваться вызовом метода

public class MethodInit {
    int i = f();
    int f() {
        return 11;
    }

    public static void main(String[] args) {
        MethodInit m = new MethodInit();
        System.out.println(m.f());
        System.out.println(m.i);
    }
}
