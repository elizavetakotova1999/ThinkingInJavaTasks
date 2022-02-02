package com.company.operators;

import java.util.Random;

import static com.company.util.Print.print;

public class Bool {//Логические операторы
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = " + j);
        print("i > j is " + (i > j));
        print("i < j is " + (i < j));
        print("i >= j is " + (i >= j));
        print("i <= j is " + (i <= j));
        print("i == j is " + (i == j));
        print("i != j is " + (i != j));
        // В Java целое число (int) не может интерпретироваться как логический тип(boolean)
        print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)) );//false
        print("(i < 10) || (j < 10) is " + ((i > 10) || (j < 10)) );//true
    }
}
