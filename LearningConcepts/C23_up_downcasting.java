class Parent5 {
    String name;

    void method()
    {
        System.out.println("Method from Parent Class");
    }
    void status(){
      System.out.println("Status from Parent");
    }
}

class Child5 extends Parent5 {
    int id;

    @Override void method()
    {
        System.out.println("Method from Child Class");
    }
      void childstatus(){
      System.out.println("Status from child Class ");
    }

}

class C23_up_downcasting{

  public static void main(){
    
        // upcasting
        Parent5 p = new Child5();
        p.name = "GeeksforGeeks";

        System.out.println(p.name);
        
        p.method();

        // Child c = new Parent(); - > compile time error
        // downcasting Explicitly
        Child5 c = (Child5)p;
        
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
        c.status();
        c.childstatus();
  
  }
}
