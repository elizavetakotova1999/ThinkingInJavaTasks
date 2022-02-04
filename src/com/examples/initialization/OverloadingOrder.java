package com.examples.initialization;

import static com.examples.util.Print.print;

//Перегрузка основанная на порядке следования аргументов
public class OverloadingOrder {
    static void f(String s ,int i){
        print("String: " + s + ", int: " + i);
    }
    static void f(int i, String s){
        print("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("Сначала строка",11);
        f(99,"Сначала число");
    }
}
