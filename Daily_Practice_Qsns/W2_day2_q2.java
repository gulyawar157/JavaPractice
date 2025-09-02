

public class W2_day2_q2  {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {  
            System.out.println("Caught NullPointerException");
        } catch (Exception e) {           
            System.out.println("Caught General Exception");
        }
    }
}



// Correct order is that we have to  catch child exceptions before parent exceptions.





