class A{
      public void  math1(){
    System.out.println(" I am method 1 of class A");
      }
    }

    class B extends A{
         public void math1(){
            System.out.println("I am the method 1 of class B");
        }
        public void math2(){
            System.out.println("I am the method 2 of class B");
        }
    }


public class C16_methodoverriding {
    public static void main(String[] args) {
         A new1 = new A();
         new1.math1();

         B new2 = new B();
         new2.math1();
    }
}
