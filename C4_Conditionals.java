import java.util.Scanner;

public class C4_Conditionals {
       public static void main(String[] args) {
        int number = -5;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative or zero.");
        }

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();

        // // Category the age into groups
        // int ageGroup;
        // if (age < 18) {
        //     ageGroup = 1;
        // } else if (age >= 18 && age <= 70) {
        //     ageGroup = 2;
        // } else {
        //     ageGroup = 3;
        // }

        // switch (ageGroup) {
        //     case 1:
        //         System.out.println("You are NOT eligible for driving.");
        //         break;
        //     case 2:
        //         System.out.println("You ARE eligible for driving.");
        //         break;
        //     case 3:
        //         System.out.println("Please check with your doctor or local laws.");
        //         break;
        //     default:
        //         System.out.println("Invalid input.");
        // }


        int a = 10;
        int b = 5;
       char operator = sc.next().charAt(0)      ;      

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }



      
    }
}
