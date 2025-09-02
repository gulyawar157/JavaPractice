public class Day1_q4 {
    public static void main(String[] args) {
        String str = "Hello World";

       int n = str.length();
         str.charAt(2) = 'd';   // This wont work
         System.out.println(str);

         //* Because strings are immutable so we can not change manipulate or change the password if required.  But char arrays are mutable, hence strings are not used for storing the password and char arrays are peferred  */
    }
}
