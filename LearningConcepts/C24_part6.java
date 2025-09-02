//* learning finally block */
public class C24_part6 {

    public static int greet(){

        try{
            int a = 37;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
                System.out.println("--End of the program -- cleaning up the resources ");
        }

        return -1;
    }
    public static void main(String[] args) {

       int k = greet();
       System.out.println(k);
    }
}
