class mainEmployee{
    public int id;
    public String name;

    public mainEmployee(int id, String name){
    this.id = id;
    this.name = name;
    }

        public mainEmployee(){
      id = 9832;
      name = "K.K. Wood";
    }

           public mainEmployee(int id){
      this.id = id;
      name = "B.K. Singh";
    }


}


public class C12_constructors {
    public static void main(String[] args) {
          mainEmployee e1 = new mainEmployee(3212, "KJ Stuart");
           
       System.out.println(e1.id);
       System.out.println(e1.name);

       mainEmployee e2 = new mainEmployee();
        System.out.println(e2.id);
       System.out.println(e2.name);

         mainEmployee e3 = new mainEmployee(4182);
        System.out.println(e3.id);
       System.out.println(e3.name);
 
    }
}


