//*Abstract class can have non abstract ethod also. but in interface all methods are  */


interface Car2{
    int a = 9;
    void noofseats();
     void name();
    
}

interface impfeatures {
    int x = 88;
    void fueltype();
}

class Tesla implements Car2, impfeatures{
    public void noofseats(){
           System.out.println("No. of seates in car are : 4");
    }
     public void name(){
        System.out.println("Name of Car is Tesla  ");
    }
     public void fueltype(){
        System.out.println(" Elecric Vehicle");
    }
}


public class C21_interface {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        t1.noofseats();
        t1.fueltype();

        System.out.println(t1.a);
       System.out.println(t1.x);

    //  t1.x = 55;   -- Not possible , we cannot modify properties in interface as they are final

    }
}
