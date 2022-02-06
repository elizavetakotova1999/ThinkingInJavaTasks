package com.examples.initialization;

import java.util.Arrays;
import java.util.Random;
//Создание массива непримитивных объектов
import static com.examples.util.Print.print;

public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("Длина массива a = " + a.length);
        for(int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500); // Автоупаковка
        }
        print(Arrays.toString(a));
    }
}