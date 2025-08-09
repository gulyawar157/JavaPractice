 class Employee{
       public int idno ;
       public String name;
       public  String dept;

         Employee( int idno, String name,  String dept){
           this.idno =idno;
           this.name = name;
           this.dept = dept; 
         }
    }

public class C6_Array2 {
   
    public static void main(String[] args) {
        //*Array of objects */
        int [] employees;
        employees = new int [5];
        employees[0]= new Employee(3422, "YN Kumar", "Delhi");
         employees[1]= new Employee(3412, "TT Kumar", "Noida");
     employees[2]= new Employee(3412, "UI Kumar", "Noida");
    employees[3]= new Employee(3412, "BB Kumar", "Noida");
         employees[4]= new Employee(3412, "NN Kumar", "Noida");


    }
}
