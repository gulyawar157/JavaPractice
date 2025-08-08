//  Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
import java.util.Scanner;

public class Day1_q1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
         int[] arr2 = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< 10; i++){
            arr[i] = sc.nextInt();
        }
for(int i = 9; i>=0; i--){
        arr2[9-i] = arr[i];
        }

for(int i = 0; i<10; i++){
      System.out.print(arr[i]);
        }

        for(int i = 0; i<10; i++){
      System.out.print(arr2[i]);
        }

    }
}
