package com.examples.control;

import static com.examples.util.Print.print;

// Цикл for с метками (label)
//Метки это замена устаревшему goto.
// Метка может быть полезна как точка возвращения, если мы используем вложенные циклы.
// !использовать только перед телом цикла!

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer://метка(другие команды не допустимы)

        for (; true; ) { //бесконечный цикл
            inner://метка(другие команды не допустимы)
            for (; i < 10; i++) {
                print("i = " + i);
                if (i == 2) {
                    print("continue");
                    continue;
                }

                if (i == 3) {
                    print("break");
                    i++;// В противном случае i не увеличивается
                    break;
                }

                if (i == 7) {
                    print("continue outer");
                    i++;// В противном случае i не увеличивается
                    continue outer;//метка
                }
                if (i == 8) {
                    print("break outer");
                    break outer;//метка
                }

                for (int j = 0; j < 5; j++) {
                    if (j == 3) {
                        print("continue inner");
                        continue inner;//метка
                    }
                }
            }
        }//конец тела бесконечного цикла

    }
}
