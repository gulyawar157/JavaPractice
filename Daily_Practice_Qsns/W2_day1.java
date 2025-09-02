public class W2_day1 {
    public static void main(String[] args) {
        int a =134;
        int b =0;
        try{
            int div = a/b;
        } catch(Exception e){
            System.out.println("Caught Exception" + e);
        } catch (NullPointerException e){
            System.out.println("Caught NullPointerException");
        }
    }
}


//*Not possible because Correct order is that we have to  catch child exceptions before parent exceptions */