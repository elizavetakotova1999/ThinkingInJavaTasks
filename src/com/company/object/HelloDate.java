package com.company.object;
import java.util.*;

/**
 * @author Elizaveta Kotova
 * @author www.example.com
 * @version 4.0
 */
public class HelloDate {
    /**
     * @param args Массив строковых аргументов
     * @throws exceptions Исключения не выдаются
     */

    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date()); //выводит текущие день, месяц, число, время и год.
    }
}
