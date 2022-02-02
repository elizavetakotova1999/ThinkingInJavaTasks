package com.company.operators;

import static com.company.util.Print.print;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z );
        print(x + " " + s);//Преобразует x в String
        s+="(сумма) = ";//Оператор конкатенации
        print(s + (x + y + z));
        print(""+x);//сокращение Integer.toString();
    }
}
