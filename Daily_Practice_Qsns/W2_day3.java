class Animal3{
    void sound(){
  System.out.println("Animal Sounds are generated here ");
    }
}

class Cat3 extends Animal3{
    void sound(){
        System.out.println("Meow Meow");
    }
}

public class W2_day3 {
    public static void main(String[] args) {
        Animal3 a = new Animal3();

        try{
          Cat3 c = (Cat3) a;
        }
        catch(Exception e){
            System.out.println("Caught Class Cast Exception " ); 
            System.out.println(e);
        }
       
    }
}
