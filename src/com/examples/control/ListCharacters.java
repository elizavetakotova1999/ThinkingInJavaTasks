package com.examples.control;

public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0;c < Character.MAX_VALUE; c++){//c = 128;
            if (Character.isLowerCase(c)){
                System.out.println("Значение: " + (int)c + " символ " + c);
            }
        }
    }
}
