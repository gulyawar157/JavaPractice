// Alternative to NotImplementedException

class Shape {
    double area() {
        throw new UnsupportedOperationException("Area method not implemented yet!");
    }
}

public class C24_part10 {
    public static void main(String[] args) {
        Shape s = new Shape();
        try{
              s.area();
        }
        catch(Exception e){
             System.out.println("Caught");
             System.out.println(e.getMessage());
        }
        

        System.out.println("Program Finished");
    }
}
