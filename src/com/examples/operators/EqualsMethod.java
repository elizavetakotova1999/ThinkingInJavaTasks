package com.examples.operators;

public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.equals(n2));//результат - true
        // equals  по умолчанию сравнивает ссылки, а не содержимое
    }
}
