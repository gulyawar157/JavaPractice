public class C3_string_4 {
    public static void main(String[] args) {
          String str = "Hello World";

        char[] chars = str.toCharArray();
        chars[2] = 'd';                 
        str = new String(chars);           

        System.out.println(str);
    }
}
