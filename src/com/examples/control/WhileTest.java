package com.examples.control;

public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()){//повторять пока condition() равно true
            System.out.println("Inside 'while' ");
            System.out.println("Exited 'while' ");
        }
    }
}
