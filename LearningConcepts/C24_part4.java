import java.util.*;
class MyException extends Exception{
     public String toString(){
              return super.toString()  + " I am to String ";
     }
     public String getMessage(){
           return super.getMessage() + " I am getmessage() ";
     }
}

public class C24_part4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int a;
      System.out.println("Enter the number : ");
      a = sc.nextInt();

      if(a<99){
        try{
              //  throw new ArithmeticException ("This is an exception message ");
              throw new MyException();
        }
        catch(Exception e){
    System.out.println(e.getMessage());
    System.out.println(e.toString());
    e.printStackTrace();
    System.out.println("Finished");
        }
        System.out.println("Yes finished ");
      }


  }    

}











// import java.util.*;
// class MyException extends Exception{
//      public String toString(){
//               return  " I am to String ";
//      }
//      public String getMessage(){
//            return " I am getmessage() ";
//      }
// }

// public class C24_part4 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//       int a;
//       System.out.println("Enter the number : ");
//       a = sc.nextInt();

//       if(a<99){
//         try{
//                 throw new ArithmeticException ("This is an exception message ");
              
//         }
//         catch(Exception e){
//     System.out.println(e.getMessage());
//     System.out.println(e.toString());
//     e.printStackTrace();
//     System.out.println("Finished");
//         }
//         System.out.println("Yes finished ");
//       }


//   }    

// }
