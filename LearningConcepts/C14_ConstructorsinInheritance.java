class base1{
    int x;

    public void setX(int n){
        System.out.println("I am currently in the base setting X now : ");
        x = n;
    }
    public int getx(){
        return x;
    }

    public void basestatus(){
        System.out.println("I am in the base class noww");
    }
      base1(){
        System.out.println("I am the base class consructor ");
    }
    base1(int a){
        System.out.println("I am the base class constructor with value  " + a) ;
    }
}

class derived1 extends base1{
    int y;
    public void setY(int n){
        y = n;
    }
      public int gety(){
        return y;
    }

     public void derivedstatus(){
    
        System.out.println("I am in the derived class noww");
     }
  
        derived1(){
           
        System.out.println("I am the derived class consructor ");
    }

        derived1(int a, int b){
            super(b);
        System.out.println("I am the derived class consructor with  " + a + " and " + b);
    }
    

}

class childderived1 extends derived1{
    childderived1(){
        System.out.println("I am the child of derived constructor");
    }

  childderived1(int a , int b, int c){
  System.out.println("I am an overloaded constructor constructor of derived with " + a + " " + b + " " + c);
    }
}

public class C14_ConstructorsinInheritance {
    public static void main(String[] args) {
        base1 b = new base1();
          System.out.println("-----------------------------");
        derived1 d = new derived1();
   System.out.println("-----------------------------");
         derived1 d1 = new derived1(3, 9);
   System.out.println("-----------------------------");

         childderived1 cd1 = new childderived1(3, 8, 7);
      
    }
}
