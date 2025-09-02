interface network{
    void networkname();
    void spectrum();
     void dataspeed();
}

 class network2G implements network{
       public void networkname(){
           System.out.println(" Network is 2G");
       }
         public void spectrum(){
          System.out.println("Low range spectrum");
       }

           public void dataspeed(){
           System.out.println(" Upto 64kbps ");
       }
 }
class network3G implements network{
       public void networkname(){
           System.out.println(" Network is 3G");
       }
         public void spectrum(){
          System.out.println("Medium range spectrum");
       }

           public void dataspeed(){
           System.out.println(" Upto 2  mbps");
       }
 }

 class network4G implements network{
       public void networkname(){
           System.out.println(" Network is 4G");
       }
         public void spectrum(){
          System.out.println("Wide range spectrum");
       }

           public void dataspeed(){
           System.out.println(" Upto 10-100mbps  ");
       }
 }


 class network5G implements network{
       public void networkname(){
           System.out.println(" Network is 5G");
       }
         public void spectrum(){
          System.out.println("Wide range spectrum");
       }

           public void dataspeed(){
           System.out.println(" Upto 10gbps ");
       }
 }
public class Day3_q1 {

    public static void main(String[] args) {

        System.out.println(" Showing my 2G network features :  ");
            network mynetwork;
            
            mynetwork = new network2G();
    mynetwork.dataspeed();
    mynetwork.networkname();
     mynetwork.spectrum();

       System.out.println(" Showing my 3G network features :  ");
         mynetwork = new network3G();
    mynetwork.dataspeed();
    mynetwork.networkname();
     mynetwork.spectrum();

System.out.println(" Showing my 4G network features : ");
         mynetwork = new network4G();
    mynetwork.dataspeed();
    mynetwork.networkname();
     mynetwork.spectrum();

     
System.out.println(" Showing my 5G network features : ");
         mynetwork = new network5G();
    mynetwork.dataspeed();
    mynetwork.networkname();
     mynetwork.spectrum();
    }

}
