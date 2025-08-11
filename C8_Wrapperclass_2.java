//* Custom wrapper class  */

class Maximum{
     private int maxi = 0;
      private int size =  0;
    public void insert(int x){
        this.size++;
       if(x>maxi){
        this.maxi = x;
       }
       return;
       
    }

    public int top(){
     return this.maxi;
    }

    public int elementnumber(){
       return this.size;
    }

   
}

public class C8_Wrapperclass_2 {
    public static void main(String[] args) {
        Maximum x = new Maximum();

        x.insert(12);
        x.insert(3);
        x.insert(23);

        System.out.println("Maximum element: " + x.top());
        System.out.println("Number of elements inserted: "
                           + x.elementnumber());
    }
}
