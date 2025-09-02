interface A {
    int i = 111;
}

class B  implements A {
    void methodB(){
    int i = 222; 
    }
}

class Day4_q1 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.methodB();
    }
}

//*Because it creates a new local variable that exists only inside methodB */
//*That's why no error.... */

