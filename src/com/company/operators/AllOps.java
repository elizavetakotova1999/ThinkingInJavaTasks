package com.company.operators;

public class AllOps {//Сводка операторов
    // Проверяет все операторы со всеми примитивными данными, чтобы показать какие операции допустимы компилятором Java
    // Для результатов теста типа boolean:
    void f(boolean b) {}
    void boolTest(boolean x, boolean y) {
        // Арифметические операции:
        // x = x * y;
        // x = x / y;
        // x = x % y;
        // x = x + y;
        // x = x - y;
        // x++;
        // x--;
        // x = +y;
        // x = -y;
        // Операции сравнения и логические операции:
        // f(x > y);
        // f(x >= y);
        // f(x < y);
        // f(x <= y);
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        // Поразрядные операции:
        // x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        // x = x << 1;
        // x = x >> 1;
        // x = x >>> 1;
        // Совмещенное присваивание:
        // x += y;
        // x -= y;
        // x *= y;
        // x /= y;
        // x %= y;
        // x <<= 1;
        // x >>= 1;
        // x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // Приведение:
        // char c = (char)x;
        // byte b = (byte)x;
        // short s = (short)x;
        // int i = (int)x;
        // long l = (long)x;
        // float f = (float)x;
        // double d = (double)x;
    }
    void charTest(char x, char y) {
        // Арифметические операции:
        x = (char)(x * y);
        x = (char)(x / y);
        x = (char)(x % y);
        x = (char)(x + y);
        x = (char)(x - y);
        x++;
        x--;
        x = (char)+y;
        x = (char)-y;
        // Операции сравнения и логические операции:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        // f(!x);
        // f(x && y);
        // f(x || y);
        // Поразрядные операции:
        x= (char)~y;
        x = (char)(x & y);
        x  = (char)(x | y);
        x = (char)(x ^ y);
        x = (char)(x << 1);
        x = (char)(x >> 1);
        x = (char)(x >>> 1);
        // Совмещенное присваивание:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // Приведение:
        // boolean bl = (boolean)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    void byteTest(byte x, byte y) {
        // Арифметические операции:
        x = (byte)(x* y);
        x = (byte)(x / y);
        x = (byte)(x % y);
        x = (byte)(x + y);
        x = (byte)(x - y);
        x++;
        x--;
        x = (byte)+ y;
        x = (byte)- y;
        // Операции сравнения и логические операции:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        // f(!x);
        // f(x && y);
        // f(x || y);
        // Поразрядные операции:
        x = (byte)~y;
        x = (byte)(x & y);
        x = (byte)(x | y);
        x = (byte)(x ^ y);
        x = (byte)(x << 1);
        x = (byte)(x >> 1);
        x = (byte)(x >>> 1);
        // Совмещенное присваивание:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // Приведение:
        // boolean bl = (boolean)x;
        char c = (char)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    void shortTest(short x, short y) {
        // Арифметические операции:
        x = (short)(x * y);
        x = (short)(x / y);
        x = (short)(x % y);
        x = (short)(x + y);
        x = (short)(x - y);
        x++;
        x--;
        x = (short)+y;
        x = (short)-y;
        // Операции сравнения и логические операции:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        // f(!x);
        // f(x && y);
        // f(x || y);
        // Поразрядные операции:
        x = (short)~y;
        x = (short)(x & y);
        x = (short)(x | y);
        x = (short)(x ^ y);
        x = (short)(x << 1);
        x = (short)(x >> 1);
        x = (short)(x >>> 1);
        // Совмещенное присваивание:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // Приведение:
        // boolean bl = (boolean)x;
        char c = (char)x;
        byte b = (byte)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    void intTest(int x, int y) {
        // Арифметические операции:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // Операции сравнения и логические операции:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        // f(!x);
        // f(x && y);
        // f(x || y);
        // Поразрядные операции:
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        // Совмещенное присваивание:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // Приведение:
        // boolean bl = (boolean)x;
        char c = (char)x;
        byte b = (byte)x;
        short s = (short)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }
    void longTest(long x, long y) {
        // Арифметические операции:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // Операции сравнения и логические операции:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        // f(!x);
        // f(x && y);
        // f(x || y);
        // Поразрядные операции:
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        // Совмещенное присваивание:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // Приведение:
        // boolean bl = (boolean)x;
        char c = (char)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        float f = (float)x;
        double d = (double)x;
    }
    void floatTest(float x, float y) {
        // Арифметические операции:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // Операции сравнения и логические операции:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        // f(!x);
        // f(x && y);
        // f(x || y);
        // Поразрядные операции:
        // x = ~y;
        // x = x & y;
        // x = x | y;
        // x = x ^ y;
        // x = x << 1;
        // x = x >> 1;
        // x = x >>> 1;
        // Совмещенное присваивание:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        // x <<= 1;
        // x >>= 1;
        // x >>>= 1;
        // x &= y;
        // x ^= y;
        // x |= y;
        // Приведение:
        // boolean bl = (boolean)x;
        char c = (char)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        double d = (double)x;
    }
    void doubleTest(double x, double y) {
        //Арифметические операции:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // Операции сравнения и логические операции:
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
//        ! f(!x);
//        ! f(x && y);
//        ! f(x || y);
//         Поразрядные операции:
//        ! x = ~y;
//        ! x = x & y;
//        ! x = x | y;
//        ! x = x ^ y;
//        ! x = x << 1;
//        ! x = x >> 1;
//        ! x = x >>> 1;
        // Совмещенное присваивание:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        // x <<= 1;
        // x >>= 1;
        // x >>>= 1;
        // x &= y;
        // x ^= y;
        // x |= y;
        // Приведение:
        // boolean bl = (boolean)x;
        char c = (char)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
    }
}