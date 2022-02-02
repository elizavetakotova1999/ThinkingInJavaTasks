package com.company.operators;

import static com.company.util.Print.print;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        print(Integer.toBinaryString(i));
        i>>>=10;
        print(Integer.toBinaryString(i));
        long l = -1;
        print(Long.toBinaryString(l));
        l>>>=10;
        print(Long.toBinaryString(l));
        short s = -1;
        print(Integer.toBinaryString(s));
        byte b = - 1;
        print(Integer.toBinaryString(b));
        b>>>=10;
        print(Integer.toBinaryString(b));
        b = -1;
        print(Integer.toBinaryString(b));
        print(Integer.toBinaryString(b>>>10));
    }
}
