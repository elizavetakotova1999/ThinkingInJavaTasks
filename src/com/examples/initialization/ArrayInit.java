package com.examples.initialization;
import java.util.Arrays;
//Инициализация массивов
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3, // Автоматическая упаковка
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3, // Автоматическая упаковка
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
