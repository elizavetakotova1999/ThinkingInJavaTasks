package com.examples.initialization;

import java.util.Arrays;
import java.util.Random;

import static com.examples.util.Print.print;
//Создание массивов оператором new
//Если заранее не известно какой нужен размер массива.
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(50);
        a = new int[rand.nextInt(20)];
        print("Длина массива a = " + a.length);
        print(Arrays.toString(a));
    }
}
