public class C24_Errors {
    public static void main(String[] args) {
        int a = 987;
        int b = 0;

       try{
            int c = a/b;
            System.out.println("The reult is : " + c);
       }catch(Exception e){
             System.out.println("Not able to divide because of : ");
             System.out.println(e);
       }

       System.out.println("End of the program ");
    }
}
