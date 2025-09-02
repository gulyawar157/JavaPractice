public class C19_polymorphism {

    static void categ1(int a , int b){
          System.out.println(a + b);
    }

       static void categ1(int a , int b, int c){
          System.out.println(a + b+c);
    }
    public static void main(String[] args) {
        categ1(5, 3);
        categ1(6, 3, 2);
    }
}


//*Compile time polymorphism */