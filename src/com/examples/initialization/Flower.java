package com.examples.initialization;
import static com.examples.util.Print.print;

//Вызов конструктора с использованием this

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        petalCount = petals;
        print("Конструктор с параметром int, petalCount = " + petalCount);
    }
    Flower(String ss){
        print("Конструктор с параметром String, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals){
        this(petals);
        // this(s);//Вызов другого конструктора запрещен
        this.s = s;//Другое использование this
        print("Аргументы String и int");
    }
    Flower(){
        this("hi", 47);
        print("Конструктор по умолчанию(без аргументов)");
    }
    void printPetalCount(){
        //this(11);//Разрешается только в конструкторах
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
