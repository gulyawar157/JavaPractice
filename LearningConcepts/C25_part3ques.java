//*inside caught exception can be thrown ?  */
// Yes by using try catch block
public class C25_part3ques  {
    public static void main(String[] args) {
        try {
           int c = 10/0;
     
        } catch (ArithmeticException e) {  // specific first
             throw new RuntimeException();
        //    try{
        //     throw new RuntimeException();
        //    }catch(RuntimeException ex){
        //             System.out.println("Caught ----  ");
        //    }
        }
     
    }
}
