class base{
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

}

class derived extends base{
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

}

public class C13_Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getx());

        //*Creating the object of derived classs */
        derived d = new derived();
        d.setY(7);
        System.out.println(d.gety()); 

       d.basestatus();

       d.derivedstatus();
    }
}
