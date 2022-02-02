package com.company.object;
import java.util.*;
import static com.company.util.Print.*;

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
        print("Привет, сегодня: "); //заменяем System.out.println() на метод print()
        print(new Date()); //выводит текущие день, месяц, число, время и год.
    }
}
