package com.examples.initialization;
//Простой пример использования ключевого слова "this"

/*this - это получение ссылки на текущий объект, во время выполнения метода.
Можно использовать только внутри не-статического метода.
this представляет ссылку на объект для которого был вызван метод.*/

public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().increment().print();
    }
}
