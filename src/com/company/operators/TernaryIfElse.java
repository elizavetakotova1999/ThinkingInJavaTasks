package com.company.operators;

import static com.company.util.Print.print;

public class TernaryIfElse {//Тернарный оператор
    //логическое выражение ? выражение1 : выражение2
    //Если логическое выражение true, вычисляется выражение1, если false, то вычисляется выражение2
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
    static int standardIfElse(int i){
        if(i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        print(ternary(9));
        print(ternary(10));
        print(standardIfElse(9));
        print(standardIfElse(10));
    }

}
