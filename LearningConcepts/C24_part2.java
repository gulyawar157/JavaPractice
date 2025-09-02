import java.util.*;

public class C24_part2{
    public static void main(String[] args) {
       int marks[] = new int [3];
       marks[0]= 12;
       marks[1] = 5;
       marks[2] = 9;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the array index : ");
       int ind = sc.nextInt();

       int number ;
       System.out.println("Enter the number you want to divide the value with ");
        number = sc.nextInt();


       try{
        System.out.println("The value at an array indexed entered is " + marks[ind]);
        System.out.println("The value of array-value/number is " + marks[ind]/number);
       }
       catch(ArithmeticException e){
        System.out.println("Arithmetic exception occured ");
        System.out.println(e);
       }

       catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Arrray Index out of bound of exception occured ");
        System.out.println(e);
       }
       
       catch(Exception e){
              System.out.println("Some other exception occured");
              System.out.println(e);
       }

    }
}