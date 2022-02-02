package com.company.operators;
import static com.company.util.Print.print;

class Letter {
    char c;
}
public class PassObject {

    static void f(Letter y) {
        y.c = 'z';//строка изменяет объект за пределами метода f() и будет выполнена раньше
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);// не будет перезаписана, см. выше
        print("2: x.c: " + x.c);
    }

}