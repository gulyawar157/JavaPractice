public class C3_strings_3 {
    public static void main(String[] args) {
        String s1 = "Moon";
        String s2 = s1;
      //  s1 = s1 + "Walk"; 
      s1 = s1.concat("Walk");
        System.out.println(s1);
        System.out.println(s1 == s2);
    }
}
