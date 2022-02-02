package com.company.operators;

public class Equivalence { //Проверка объектов на равенство
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);//false
        System.out.println(n1 != n2);//true
    }

}
