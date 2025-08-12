public class C3_Strings_2 {
    public static void main(String[] args) {
        char[] arr = {'m', 'y', 'n', 'a', 'm','e'};

        // for(int i =0; arr[i]!= '\0'; i++){
        //     System.out.println(arr[i]);
        // }
        
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }


        String str = "Adventure";
        System.out.println("Length is " + str.length());
         System.out.println(str.charAt(2));
           System.out.println(str.substring(2));
             System.out.println(str.substring(3,8));



             //String memrory
             String s1 = "Java";
             String s2 = "Java";

             if(s1 == s2){
                System.out.println("Yes");
             }
             else System.out.println("No");

             String s3 = new String("Java");
             if(s1 == s3)   System.out.println("Yes");
             else  System.out.println("No");

             String s4 = "Caterpillar";
             String s5 = "pill";
               String s6 = "Caterpillar";

             System.out.println(s4.contains(s5));  // s5 is present in s4 or not
                System.out.println(s4.equals(s6));

              System.out.println(s4.indexOf(s5));//*whether s5 is present in s4 or not */

                int res = s4.compareTo(s5);

                if(res>0){
                    System.out.println("Greater");

                }

                else if(res<0){
                    System.out.println("Lesser");
                }
                else{
                    System.out.println("Equal");
                }

                

    }
}
