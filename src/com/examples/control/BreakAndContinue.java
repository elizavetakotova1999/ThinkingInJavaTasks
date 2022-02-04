package com.examples.control;

import static com.examples.util.Range.range;

//команда break завершает цикл, при этом оставшиеся операторы цикла  не выполняются
//команда continue останавливает выполнение текущей итерации цикла и переходит к началу цикла,
// чтобы начать выполнение нового шага.

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;//Выход из цикла, i не доходит до ста и прерывается на 74
            if (i % 9 != 0) continue;//Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : range(100)) {
            if (i == 74) break;//Выход из цикла
            if (i % 9 != 0) continue;//Следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (i == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
