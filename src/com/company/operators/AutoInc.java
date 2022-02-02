package com.company.operators;
import static com.company.util.Print.print;

public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i = " + i);
        print("++i : " + ++i); // Префиксный инкремент
        print("i++ : " + i++); // Постфиксный инкремент
        print("i = " + i);
        print("--i : " + --i); // Префиксный декремент
        print("i-- : " + i--); // Постфиксный декремент
        print("i : " + i);
    }
}
