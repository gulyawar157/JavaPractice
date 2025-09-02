import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Ways to print arrays in java : 
public class C6_Array3 {
      public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); 


        //For 2d/3D Array deepToString() is used
             int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(arr1)); 

    
        //using for loop
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
         System.out.print("\n");

        //4. using enhanced for loop i.e. for each loop 
           int[] arr3 = {1, 2, 3, 4, 5};
        for (int num : arr3) {
            System.out.print(num + " ");
        }
         System.out.print("\n");

       // 5. Using Streams (Java 8+) --- Functional programming style.
           int[] arr4 = {1, 2, 3, 4, 5};
        Arrays.stream(arr4).forEach(n -> System.out.print(n + " "));
        
      // 6. Using Stream.of() for Object arrays
        String[] names = {"Alice", "Bob", "Charlie"};
        Stream.of(names).forEach(System.out::println);

        // 7. Using String.join() (for String arrays only)
        String[] names1 = {"Alice", "Bob", "Charlie"};
        System.out.println(String.join(", ", names1));

        // 8. Using forEach with List conversion --- Convert array → list → print.
        Integer[] arr5 = {1, 2, 3, 4, 5};
        Arrays.asList(arr5).forEach(System.out::print);

        // 9. Using Collectors.joining() (Java 8+) ---  Functional way to join with separator.
        String[] names3 = {"Alice", "Bob", "Charlie"};
        String result = Arrays.stream(names3)
                              .collect(Collectors.joining(" | "));
        System.out.println(result);
        // Output: Alice | Bob | Charlie

    }
}
