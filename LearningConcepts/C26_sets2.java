import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class C26_sets2 {
    public static void main(String[] args) {
        CopyOnWriteArraySet <Integer> copyonwriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet <Integer> concurrentskipSet = new ConcurrentSkipListSet<>();
        
        for(int i = 1 ; i<=5; i++){
            copyonwriteSet.add(i);
              concurrentskipSet.add(i);
        }

        System.out.println("Initial Copy On Write Set is : "  + copyonwriteSet);
           System.out.println("Initial Concurrent Skip List Set is : "  + concurrentskipSet);

           System.out.println("Iterating and Modifying the copy on the write set ");
           for(int num : copyonwriteSet){
            System.out.println("Reading: " + num);

            copyonwriteSet.add(6);
           }

           System.out.println(copyonwriteSet);

           // Copy on write Set -- Iterators do not reflect modifications 
           // Modidications wil be done on new Array and after iterating purani = new
           //They are thread safe 
           // Copy on Write Mechanism 
           // No Duplicate Elements 


           //concurrent skip set is weakly consistent 
       // Which of them to use depend on the usecase 
       // Iteration - CopyonWrite  because we need stability and frequent read and write -- Concurrent on skip because everytime new space is allocated on copyonwrite set 
           System.out.println("Iterating and Modifying the Concurrent Skip Set ");
           for(int num : concurrentskipSet){
            System.out.println("Reading: " + num);

            if(num==5){
                concurrentskipSet.add(6);
            }
           }
           
    }
}



