package com.company.operators;

public class Casting {//Привидение к типу
    public static void main(String[] args) {
        int i = 200;
        long lng = i;
        lng = i; // "Расширение", явное преобразование не обязательно
        long lng2 = 200;
        lng2 = 200;
        // "Сужающее преобразование":
        i = (int) lng2; // Преобразование необходимо
    }
}
