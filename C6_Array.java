public class C6_Array {
    public static void main(String[] args) {
        //Initializing
          // Method 1:
            int arr1[];

            // Method 2:
            int[] arr2;

            // Declaring array literal  
          int[] arr3 = new int[]{ 1,2,3,4,5,6,7,8,9,10, 11 }; 

          arr2 = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
       
           

        int arr [] = new  int[5];
        arr[0] = 99;
         arr[1] = 199;
          arr[2] = 499;
           arr[3] = 299;
            arr[4] = 399;
     
        for(int i= 0; i<5; i++){
     System.out.println(arr[i]);
        }


        // Getting the length of the array
      int n = arr3.length; 
      System.out.println(n);
    }
}
