// class Base3{
//      public void msg()  {    
//    System.out.println("I am inside the mssg class of parent ");
//      }
// }

// class Child3 extends Base3{
//        public void msg() throws RuntimeException {    
//    System.out.println("I am inside the mssg class of child ");
//      }
// }



// ** This not possible
// public class C24_part9 {
//     public static void main(String[] args) {
//         Child3 c = new Child3();
//         c.msg();
//     }
// }

// import java.io.FileNotFoundException;
// import java.io.IOException;

// class Base3{
//      public void msg()  {    
//    System.out.println("I am inside the mssg class of parent ");
//      }
// }

// class Child3 extends Base3{
//        public void msg() throws FileNotFoundException {    
//    System.out.println("I am inside the mssg class of child ");
//      }
// }


// public class C24_part9 {
//     public static void main(String[] args) {
//         Child3 c = new Child3();
//         c.msg();
//     }
// }


//* Not possible */
// class Base3{
//      public void msg()  throws RuntimeException{    
//    System.out.println("I am inside the mssg class of parent ");
//      }
// }

// class Child3 extends Base3{
//        public void msg() throws Exception {    
//    System.out.println("I am inside the mssg class of child ");
//      }
// }


// public class C24_part9 {
//     public static void main(String[] args) {
//         Child3 c = new Child3();
//         c.msg();
//     }
// }



//-----------------------------------------------------------------------------------//
//* possible -- same exception in both the class :  P - IO Exception : C - IOException*/

// import java.io.IOException;

// class Base3{
//      public void msg()  throws IOException{    
//    System.out.println("I am inside the mssg class of parent ");
//      }
// }

// class Child3 extends Base3{
//        public void msg() throws IOException {    
//    System.out.println("I am inside the mssg class of child ");
//      }
// }


// public class C24_part9 {
//     public static void main(String[] args) {
//         Child3 c = new Child3();
//         try {    
//    c.msg();    
//    }  
//    catch(Exception e) {
//     System.out.println("message : caught");
//    }    
//   }   
//     }



//-----------------------------------------------------------------------------------------------
//*Possible  --   ::  */
// class Base3{
//      public void msg()  throws RuntimeException{    
//    System.out.println("I am inside the mssg class of parent ");
//      }
// }

// class Child3 extends Base3{
//        public void msg() throws ArithmeticException {    
//    System.out.println("I am inside the mssg class of child ");
//      }
// }


// public class C24_part9 {
//     public static void main(String[] args) {
//         Child3 c = new Child3();
//      c.msg();  
//   }   
//     }


//-------------------------------------------------------------------
//possible :: P- RunTimeException,  C - ---
class Base3{
     public void msg()  throws RuntimeException{    
   System.out.println("I am inside the mssg class of parent ");
     }
}

class Child3 extends Base3{
       public void msg() {    
   System.out.println("I am inside the mssg class of child ");
     }
}


public class C24_part9 {
    public static void main(String[] args) {
        Child3 c = new Child3();
     c.msg();  
  }   
}


