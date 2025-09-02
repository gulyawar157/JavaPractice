
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class MyClass {

    // This will fail at class initialization (static block),
    // because "(" is an invalid regex pattern.
    private static Pattern PATT = Pattern.compile("(");

}

public class W2_day5  {
    public static void main(String[] args) {

        // First attempt wrapped in try-catch
        try {
            new MyClass();   // <-- causes ExceptionInInitializerError
        } catch (Throwable t) {
            System.out.println("Caught first error: " + t);
        }

        // Second attempt: class is already marked erroneous,
        // so any further use still throws NoClassDefFoundError.
        try {
            new MyClass();
        } catch (Throwable t) {
            System.out.println("Caught second error: " + t);
        }
    }
}
