import java.util.*;

// eg1 --
// public class W2_day2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
       

//         try{
//             System.out.println("Enter a number : ");
//             int num = sc.nextInt();

//         } catch(Exception e){
//           System.out.println("Message for u is " +   e.getMessage());
//           System.out.println("Enter valid input");
//         }
//         finally{
//                 System.out.println("Program finish ");
//         }

//     }
// }


//eg2 --

class DatabaseConnection {
    void connect() { System.out.println("Database connected."); }
    void query() { throw new RuntimeException("Query failed!"); }
    void close() { System.out.println("Database connection closed."); }
}

public class W2_day2 {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        try {
            db.connect();
            db.query();   
            System.out.println("Query is executed successfully!");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            db.close(); 
            System.out.println("This finally block ensures cleanup.");
        }
    }
}



