
//*Throws */
// public class C24_part5 {
   
//    public static int divide(int a , int b) throws ArithmeticException{
//         int result = a/b;
//         return result;
//    }

//     public static void main(String[] args) {

//         try{
//               int c = divide(99, 0);
//               System.out.println(c);

//         }
//         catch(Exception e){
            
//         System.out.println(" Exception ");
//         }
//     }
// }



class NegativeRadiusException extends MyException{
   
    public String toString(){
        return "Radius cannot be negative";
    }

   
    public String getMessage(){
        return "Radius cannot be negative";
    }
}

public class C24_part5 {
   
     public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result= Math.PI *r*r;
        return result;
   }

    public static void main(String[] args) {

        try{
             double totalarea = area(-65);
              System.out.println(totalarea);

        }
        catch(Exception e){
          System.out.println(e.getMessage());  
           System.out.println(e.toString());  
        System.out.println(" Exception ");
        }
    }
}
