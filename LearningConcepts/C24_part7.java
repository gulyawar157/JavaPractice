// with try , catch is also necessary
// with try , finally can be used ----


public class C24_part7 {
    public static void main(String[] args) {
        int a = 7;
        int b= 9;

    while(true){
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("Final value of b is : " + b);
        }
        b--;
    }
}
}