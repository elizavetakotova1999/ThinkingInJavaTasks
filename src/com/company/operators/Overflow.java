package com.company.operators;

public class Overflow {//Переполнение

    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("большое = " + big);
        int bigger = big * 4;
        System.out.println("еще больше" + bigger);//-4
        //Компилятор не выдает никаких ошибок но ответ не верный, происходит переполнение
    }
}
