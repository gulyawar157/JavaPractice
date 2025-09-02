class smartphones{
    
    public void info(){
        System.out.println("I am the smartphone category in the market");
    }
}

class XYZ extends smartphones{
     public void info(){
        System.out.println("I am the XYZ smartphone category in the market");
    }
}

class PQR extends smartphones{
       public void info(){
        System.out.println("I am the PQR smartphone category in the market");
    }
}



public class Day2_q2{
    public static void main(String[] args) {
        smartphones s1 ;

        s1 = new XYZ();
        s1.info();

         s1 = new PQR();
        s1.info();
    }
}



