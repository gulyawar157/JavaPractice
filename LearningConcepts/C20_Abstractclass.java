abstract class Parent1{
    Parent1(){
        System.out.println("I am in the parent class ");
    }

    public void greeting(){
        System.out.println("Geetings of the day ");
    }

    abstract public void greet();
    abstract public void playing();
}

class Child1 extends Parent1{
       public void greet(){
        System.out.println("Good Morning : ");
       }
          public void playing(){
        System.out.println(" Playing Soccer ");
       }
    }

   abstract class Child2 extends Parent1{
      

       public void connect(){
                 System.out.println("Connecting .....");
       }
}


public class C20_Abstractclass {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();

    //    Parent1 obj2 = new Parent1();  //* Not possible-- Abstract classs 's object cannot be made' */
    //*Abstract class must have 1 abstract method */
    }
}
