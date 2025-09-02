
//exception propagation   --- only for unchecked exception
import java.util.*;

class TestExceptionPropagation2{  
  void m(){  
   int data = 50/0;
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handeled");}  
  }  
 
}

public class C25_Errorspart2 {
     public static void main(String args[]){  
   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}