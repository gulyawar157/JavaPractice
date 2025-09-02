class Phone{
    Phone(String name){
    System.out.println("This is the Phone " + name);
    }
    public void greet(){
        System.out.println("Greetings of the day");
    }
    public void oni(){
        System.out.println("Turning on the Phone");
    }
}

class Smartphone extends Phone{
    Smartphone(String name){
        super(name);
    System.out.println("This is the smartphone " + name);
    }
    public void music(){
        System.out.println("Playing the music ");
    }

    // @Override
     public void on(){
        System.out.println("Turning on the SamartPhone");
    }
}

public class C17_dynamic_methoddispatch {
    public static void main(String[] args) {
        // Phone p1 = new Phone();              //Allowed
        // Smartphone s1  = new Smartphone();    // Allowed

        Phone obj = new Smartphone("Samsung");   // Allowed

        
       // SmartPhone obj2 = new phone();     // Not Alowed

       obj.greet();
    
       
      // obj.music(); Not ALllowed
    }
}

//* which method run decide on runtime because object is made in runtime . This is helpful in runtime polymorphism*/