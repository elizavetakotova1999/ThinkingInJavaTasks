package com.examples.access;

class Soup1 {
    private Soup1() {}
    // (1) Разрешаем создание объектов в статическом методе:
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    // (2) Создаем один статический объект и по требованию возвращаем ссылку на него:
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}

// В файле может быть определен только один public класс:
public class Lunch {
    void testPrivate() {
        // Запрещено, так как конструктор объявлен приватным:
        //! Soup1 soup = new Soup1();
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2.access().f();
    }
}
