package com.examples.control;

import static com.examples.util.Print.print;

public class ifElse2 {
    static int test(int testval, int target) {
        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0;//одинаковые значения
        }
    }

    public static void main(String[] args) {
        print(test(10, 5));
        print(test(5, 10));
        print(test(5, 5));
    }
}
