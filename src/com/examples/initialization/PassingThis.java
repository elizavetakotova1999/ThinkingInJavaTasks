package com.examples.initialization;

//Ключевое слово this также пригодиться для передачи текущего объекта другому методу

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler{
    static Apple peel(Apple apple){
        return apple;//Очищенное яблоко//   <--
    }                                  //     |
}                                      //     |
                                       //     |
class Apple{                           //     |
    Apple getPeeled(){                 //     |
        return Peeler.peel(this);//   ---
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
