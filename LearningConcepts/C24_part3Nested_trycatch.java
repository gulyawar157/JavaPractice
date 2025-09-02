import java.util.*;

public class C24_part3Nested_trycatch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 12;
        marks[1] = 5;
        marks[2] = 9;

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Enter the array index : ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to the nested try-catch example");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Arrray Index out of bound of exception occured ");
                    System.out.println("Exception in level 2 ");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1 ");
            }

        }
        System.out.println("End of the program ");
    }
}