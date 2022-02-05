package com.examples.initialization;

class Bird2{
    //Если определены конструкторы, конструктор по умолчанию не будет генерироваться компилятором
    Bird2(int i){}
    Bird2(double d){}
}
public class NoSynthesis {
    public static void main(String[] args) {
        //Bird2 bird = new Bird2();//Нет конструктора по умолчанию
        Bird2 bird2 = new Bird2(1);
        Bird2 bird3 = new Bird2(1.5);
    }
}
