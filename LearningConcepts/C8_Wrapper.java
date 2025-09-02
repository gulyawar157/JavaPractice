// public class C8_Wrapper {
//    public static void main(String[] args) {
//      int a = 9;
//     Integer b;

//   b = a;  //*auto-boxing or auto wrapping converting primitive int to Integer object */

// 	System.out.println("The primitive int b is: " + b);
// 	System.out.println("The Integer object a is: " + a);

//     int unboxedint  = b;     // auto-unboxing
//    System.out.println("Unboxed int is : " + unboxedint);

//    }
// }

//*Explicit boxing and un-boxing */
public class C8_Wrapper {
   public static void main(String[] args) {
      int primitiveint = 9;

      Integer wrapperInt = Integer.valueOf(primitiveint); // explicit boxing
      System.out.println("The Integer object a is: " + wrapperInt);

      int unboxedint = wrapperInt.intValue(); // explicit unboxing

      System.out.println("Unboxed int is : " + unboxedint);

   }
}