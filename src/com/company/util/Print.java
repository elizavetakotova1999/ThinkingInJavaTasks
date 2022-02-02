package com.company.util;
import java.io.*;

public class Print {
    // Печатать с новой строкой:
    public static void print(Object obj) {
        System.out.println(obj);
    }
    // Напечатать новую строку отдельно:
    public static void print() {
        System.out.println();
    }
    //Печатать без перехода на новую строку:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    // Новый printf() Java SE5 (из C):
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
