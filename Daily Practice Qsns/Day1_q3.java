import java.util.Scanner;
public class Day1_q3 {
    public static void main(String[] args) {
        int[] counting  = new int[128];
          Scanner sc  = new Scanner(System.in);

         String str = sc.nextLine();

         for(char ch : str.toCharArray()){
            counting[ch]++;
         }

        //  for(int i = 0;  i<128; i++){
        //     System.out.println( "Characters "+ i +" " + counting[i]);
        //  }

         for(int i = 0; i<128; i++){
            if(counting[i]>=2){
                System.out.println((char)i);
            }
         }


    }
}
