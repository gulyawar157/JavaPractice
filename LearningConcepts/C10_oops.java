class GradeCard{
       String name;
       int id;
       double scoreinCGPA;

       public void printdetails(){
        System.out.println("id is : " + id );
          System.out.println("Name is " + name );
         
       }

       public double getscore(){
        return scoreinCGPA;
       }
}

public class C10_oops {
    public static void main(String[] args) {
        GradeCard Student1 = new GradeCard();
        Student1.id = 34333;
        Student1.name = "John";
        Student1.scoreinCGPA = 9.4;

        // System.out.println(Student1.id );
        // System.out.println( Student1.name);
        //   System.out.println( Student1.scoreinCGPA);

          Student1.printdetails();
          System.out.println( Student1.getscore());

    }
}
