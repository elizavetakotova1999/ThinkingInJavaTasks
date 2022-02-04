package com.examples.control;

import java.util.Random;

import static com.examples.util.Print.*;

public class VowelsAndConsonantsSwitch {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';//рандом генерирует значения между 0 и 26,
            // поэтому для символа нижнего регистра следует добавить смещение 'a'
         printnb((char)c + ", " + c + ": ");
         switch (c){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u': print("Гласная");
                 break;
             case 'y':
             case 'w': print("Условно гласная");
             break;
             default: print("Согласная");
         }
        }
    }
}
