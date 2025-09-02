class superparent {
    superparent() {
        System.out.println("This is the constructor of superparent ");
    }
}

class base3 extends superparent {

    base3() {
        this(11, 23);
        System.out.println("I am the base class consructor with no argument ");

    }

    base3(int a, int b) {
        System.out.println("I am the base class constructor with 2 argument ");
    }
}

public class Day4_q3 {
    public static void main(String[] args) {
        base3 b = new base3();

    }
}