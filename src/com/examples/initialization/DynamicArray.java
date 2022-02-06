package com.examples.initialization;
//Инициализация массива
//Можно создать массив объектов String для передачи альтернативных
// аргументов командной строки методу main() другого класса.
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{ "fiddle", "de", "dum" });
    }
}

class Other {
    public static void main(String[] args) {
        for(String s : args)
            System.out.print(s + " ");
    }
}
