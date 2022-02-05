package com.examples.initialization;

import static com.examples.util.Print.print;
//Порядок инициализации

// При вызове конструктора для создания объекта Window выводиться сообщение:
class Window {
    Window(int marker) {
        print("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // Перед конструктором(1)

    House() {
        // Показывает, что выполняется конструктор:
        print("House()");//(4)
        w3 = new Window(33); // Повторная инициализация w3(5)
    }

    Window w2 = new Window(2); // После конструктора(2)

    void f() {
        print("f()");//(6)
    }

    Window w3 = new Window(3); // В конце(3)
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Показывает, что объект сконструирован(6)
    }
}
