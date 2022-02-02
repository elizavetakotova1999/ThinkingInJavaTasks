package com.examples.operators;

import static com.examples.util.Print.print;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Шестнадцатеричный (нижний регистр)
        print("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // Шестнадцатеричный (верхний регистр)
        print("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // Восьмеричный (начинается с нуля)
        print("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // максимальное шестнадцатиричное значение char
        print("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // максимальное шестнадцатиричное значение byte
        print("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // максимальное шестнадцатиричное значение short
        print("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long суффикс
        long n2 = 200l; // long суффикс (но можно запутаться)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // float суффикс
        float f3 = 1f; // float суффикс
        double d1 = 1d; // double суффикс
        double d2 = 1D; // double суффикс
        // (Hex и Octal также работают с long)
    }
}
