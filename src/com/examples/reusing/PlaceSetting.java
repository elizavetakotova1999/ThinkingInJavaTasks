package com.examples.reusing;
//Совмещение композиции и наследования
import static com.examples.util.Print.print;

class Plate {
    Plate(int i) {
        print("Конструктор Plate");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        print("Конструктор DinnerPlate");
    }
}

class Utensil {
    Utensil(int i) {
        print("Конструктор Utensil");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        print("Конструктор Spoon");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        print("Конструктор Fork");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        print("Конструктор Knife");
    }
}

// Культурный способ сделать что-то:
class Custom {
    Custom(int i) {
        print("Конструктор Custom");
    }
}

public class PlaceSetting extends Custom {
    private final Spoon sp;
    private final Fork frk;
    private final Knife kn;
    private final DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        print("Конструктор PlaceSetting");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
