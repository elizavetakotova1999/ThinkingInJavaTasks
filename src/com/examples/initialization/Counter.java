package com.examples.initialization;
//Инициализация переменной через конструктор, не включает автоматической инициализации
public class Counter {
    int i;
    Counter() { i = 7; }

    public static void main(String[] args) {
        System.out.println(new Counter().i);
    }
}
