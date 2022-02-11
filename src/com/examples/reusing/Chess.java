package com.examples.reusing;
//Наследование, конструкторы и аргументы
import static com.examples.util.Print.print;

class Game {
    Game(int i) {
        print("Конструктор Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);//Вызов базового класса
        print("Конструктор BoardGame");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);//Вызов базового класса
        print("Конструктор Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}