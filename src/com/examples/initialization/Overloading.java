package com.examples.initialization;

import static com.examples.util.Print.print;

class Tree{
    int height;
    Tree(){
        print("Сажаем росток");
        height = 0;
    }
    Tree(int initialHeight){
        height = initialHeight;
        print("Создание нового дерева высотой " + height + "м.");
    }
    void info(){
        print("Дерево высотой " + height + "м.");
    }
    void info(String s){
        print(s + ": Дерево высотой " + height + "м.");
    }
}

public class Overloading {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
        //Перегруженный конструктор
        new Tree();
    }
}
