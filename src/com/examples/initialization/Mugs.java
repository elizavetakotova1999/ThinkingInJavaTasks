package com.examples.initialization;
import static com.examples.util.Print.print;
//Инициализация экземпляра
//В Java имеется сходный синтаксис для инициализации нестатических переменных для каждого объекта:

class Mug {
    Mug(int marker) {
        print("Mug(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    //Такой синтаксис необходим для поддержки инициализации анонимных внутренних классов
    {//начало секции инициализации экземпляра
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        print("mug1 & mug2 инициализированы");
    }//конец

    Mugs() {
        print("Mugs()");
    }
    Mugs(int i) {
        print("Mugs(int)");
    }
    public static void main(String[] args) {
        print("В методе main()");
        new Mugs();
        print("new Mugs() завершено");
        new Mugs(1);
        print("new Mugs(1) завершено");
    }
}
