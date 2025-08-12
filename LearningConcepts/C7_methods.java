// public class C7_methods {
//        static int add(int a, int b) {
//         return a + b;
//     }

//     static void tellchapter(){
//         System.out.println("This is the learning tutorial of java");
//     }

//     public static void main(String[] args) {
//         System.out.println(add(5, 3));

//         tellchapter();
//     }
// }


//* Method invocation using object */
public class C7_methods {
       public int add(int a, int b) {
        return a + b;
    }

    public void tellchapter(){
        System.out.println("This is the learning tutorial of java");
    }

    public static void main(String[] args) {
        C7_methods obj1 = new C7_methods();
        System.out.println(obj1.add(5, 3));

        obj1.tellchapter();
    }
}
