package com.company.operators;

import static com.company.util.Print.*;

public class Assigment {//Присваивание
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2;//синонимия(aliasing), t1 перезаписана и потеряла свою ссылку, а ее объект будет удален сборщиком мусора
        print("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        print("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
class Tank{
    int level;
}