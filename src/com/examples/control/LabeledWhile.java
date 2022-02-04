package com.examples.control;

import static com.examples.util.Print.print;

public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while(true){
            print("Внешний цикл while");
            while (true){
                i++;
                print("i = " + i);
                if (i == 1){
                    print("continue");
                    continue;
                }
                if (i == 3){
                    print("continue outer");
                    continue outer;
                }
                if(i == 5){
                    print("break");
                    break;
                }
                if (i == 7){
                    print("break outer");
                    break outer;
                }
            }
        }
    }
}
