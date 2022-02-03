package com.examples.control;

import static com.examples.util.Range.*;//методы с реализацией диапазона(range()),через массивы. Методы перегружены
import static com.examples.util.Print.*;

public class ForEachInt {
    public static void main(String[] args) {
        //Любой метод, возвращающий массив, может использоваться с foreach
        for (int i:range(10)) {//0..9
            printnb(i + " ");
        }
        print();
        for (int i: range(5,10)) {//5..9
            printnb(i + " ");
        }
        print();
        for (int i: range(5,20,3)) {//5..20 шаг 3
            printnb(i + " ");
        }
    }
}
