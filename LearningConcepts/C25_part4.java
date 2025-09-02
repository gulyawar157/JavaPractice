import java.io.*;

public class C25_part4 {
    public static void main(String[] args) {
        // try {
        //     // Manually throwing IOException
        //     throw new IOException("File not found!");

        // } catch (IOException e) {
        //     System.out.println("Caught IOException: " + e.getMessage());
        // }

        try {
            // This method internally uses "throw new NumberFormatException(...)"
            int num = Integer.parseInt("abc"); 
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}

