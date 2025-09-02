// In Java, the NotImplementedException is not part of the standard Java library, but it's commonly used in frameworks like Apache Commons Lang or custom implementations to indicate that a method or functionality is intentionally left unimplemented.

class NotImplementedException extends RuntimeException {
    public String getMessage() {
        return " I am getmessage() ";
    }

    // public String toString() {
    //     return " I am toString() ";
    // }

}

interface Payment {
    void upi_payment();
}

class MakePayment implements Payment {
    public void upi_payment() {

        throw new NotImplementedException();

    }
}

public class C24_part8 {
    public static void main(String[] args) {
        MakePayment obj1 = new MakePayment();

        try {
            obj1.upi_payment();
        } catch (NotImplementedException e) {
            System.out.println("Caught " + e.getMessage());
            System.out.println("Caught " + e.toString());
        }
    }
}



// output : 
// Caught  I am getmessage() 
// Caught  I am toString() 

// case2 - 
// if we do not override toString() funtion then 
// Every exception in Java inherits from Throwable, and Throwable provides this implementation of toString():

// public String toString() {
//     String s = getClass().getName();
//     String message = getLocalizedMessage();
//     return (message != null) ? (s + ": " + message) : s;
// }

// so output : 
// Caught  I am getmessage() 
// Caught NotImplementedException:  I am getmessage() 