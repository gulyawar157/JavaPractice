import java.util.*;
public class C1_Basics {
    public static void main(String[] args){
        System.out.println("Hello World");
         
        byte age = 98;
        long days = 45453334344l;
        char ch = 'A';
        float f1 = 8.4f;
        double  d1 = 4.54;
        boolean b = true;
        String st  = "abc";
        System.out.println(st);
     

   Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number 1 : ");
//         int p = sc.nextInt();

//         System.out.print("Enter number 2 : ");
//         int q = sc.nextInt();

//         int sum = p + q;
//         System.out.println(sum);


//    System.out.println("Division ---");
//         System.out.print("Enter number  1 : ");
//         float p1 = sc.nextFloat();

//         System.out.print("Enter number 2 : ");
//         float q1 = sc.nextFloat();

//         double ansr = p1/q1;
//         System.out.println(ansr);

                System.out.print("Enter number for verification ");
        boolean verify = sc.hasNextInt();
        System.out.println(verify);

 
    }
}
