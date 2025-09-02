

class smartphone3 {
    String name;
    int price;

    void run() {
        System.out.println("The smartphone is working ...");
    }
}


class Redmi extends smartphone3 { // Redmi "is-a" smartphone
    int features;

    void warranty() {
        System.out.println("The smatphone warranty is for 3 years");
    }
}


public class C22_is_arelationship {
    public static void main(String[] args) {
       Redmi mysmartphone = new Redmi();
        mysmartphone.name = "Redmi 6 Pro";
        mysmartphone.price = 89000;
        mysmartphone.features = 10;

        System.out.println(mysmartphone.name);
        System.out.println( mysmartphone.price);
        System.out.println( mysmartphone.features);

        mysmartphone.run(); 
        mysmartphone.warranty(); 
    }
}
