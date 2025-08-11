
class Parent {
    int value = 1000;
}

class Child extends Parent {
    int value = 10;
}



public class C9_instaceof_2 {
    public static void main(String[] args) {
         Parent cobj = new Child();
        Parent par = cobj;

        // Using instanceof to make sure that par
        // is a valid reference before typecasting
        if (par instanceof Child) {
            System.out.println(
                "Value accessed through "
                + "parent reference with typecasting is "
                + ((Child)par).value);
        }
    }
}
