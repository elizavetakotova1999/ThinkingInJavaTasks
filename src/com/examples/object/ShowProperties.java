package com.examples.object;

public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);//выводит свойства системы
        System.out.println("--------------------------------------");
        System.out.println(System.getProperty("user.name"));//Имя пользователя компьютера
        System.out.println("--------------------------------------");
        System.out.println(System.getProperty("java.library.path"));
    }
}
