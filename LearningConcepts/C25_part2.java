//custom exception

// Because InvalidAgeException extends Exception (not RuntimeException), it is a checked exception.
// Java enforces that all checked exceptions must be either:
// Caught inside the method with a try-catch block, OR
// Declared in the method signature using the throws keyword.

// class InvalidAgeException extends Exception{

//     @Override
    // public String getMessage() {
    //     return super.getMessage() + " This is the message";
    // }
// }

// public class C25_part2 {

//     static void validate(int age) throws InvalidAgeException{
//          if(age<18){
//                    throw new InvalidAgeException();
//          }
//          else{
//             System.out.println("You are eligible to vote");
//          }
//     }
//     public static void main(String[] args) {
//         try {
//             validate(15);
//         } catch (InvalidAgeException e) {
//              System.out.println("Caught : ");
//                System.out.println("An exception occurred: " + e.getMessage());  
//         }
//     }
// }

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }

    // @Override
    // public String getMessage() {
    //     return  super.getMessage()+ " This is the message";
    // }
}

public class C25_part2 {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Your age is not valid");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught : ");
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}



//eg 3-----
// class MyCustomException extends Exception {
// }

// // class that uses custom exception MyCustomException
// public class C25_part2 {
//     // main method
//     public static void main(String args[]) {
//         try {
//             // throw an object of user user-defined exception
//             throw new MyCustomException();
//         } catch (MyCustomException ex) {
//             System.out.println("Caught the exception");
//             System.out.println(ex.getMessage());
//         }
//         System.out.println("rest of the code...");
//     }
// }
