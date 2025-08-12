// Write a program to provide 20 % discount to Premium plan Subscribers and for normal user 5 % discount.
import java.util.Scanner;
public class Day1_q2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for premium plan and Enter 2 for Normal User: ");
        int plannum = sc.nextInt();
        
        System.out.println("Tell the total Amount: ");
        double totalamount = sc.nextDouble();
        
        double discountamount;

        if(plannum == 1){
             discountamount = 0.2*totalamount;
             
        }
        else if (plannum == 2){
                       discountamount = 0.05*totalamount;;
            
        }
        else{
            discountamount = 0;
        }
     
        double finalprice = totalamount - discountamount;
        System.out.println("Amount to be paid is " + finalprice);

    }
}
