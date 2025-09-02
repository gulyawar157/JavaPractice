class Test{
     public static String name;
      public final String id = "in time tec";
     
     Test(String name){
      this.name = name;
     }

     Test(String name, String id){
         this.name = name;
         this.id = id;
     }
     
}

public class P1_new {
    public static void main(String[] args){
          Test t1 = new Test("Aman");
            Test t2 = new Test("Boy");
          System.out.println(t1.name);

          Test t3 = new Test("mok", "Google");
          System.out.println(t3.name + " " + t3.id);

           Test t4 = new Test("tom", "amk");
          System.out.println(t3.name + " " + t3.id);
    }
}