package com.examples.control;

public class ForEachString {
    public static void main(String[] args) {
        //Любой метод, возвращающий массив, может использоваться с foreach
        for (char c:"An African Swallow".toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
