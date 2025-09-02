class base1{

     base1(){
        System.out.println("I am the base class consructor ");
        return ;
    }
    base1(int a){
        System.out.println("I am the base class constructor with value  " + a) ;
    }
}

class derived1 extends base1{
     public void derivedstatus(){
        System.out.println("I am in the derived class noww");
     }
  
       public int derived1(){
        System.out.println("I am the derived class consructor ");
        return 4;
    }
}


public class Day4_q2 {
    public static void main(String[] args) {
      derived1 d1 = new derived1();
     int p =  d1.derived1();
     System.out.println(p);
    }
}

//*constructor cannot have a return type even void. If they have h then they will become method with the same name as class. */