class newclass{
    int a;
    newclass(int a){
     this.a  =a;
    }

    public int getvalue(){
        return a;
    }

}

public class C15_thisandsuper {
    public static void main(String[] args) {
        newclass c1 = new newclass(4);
        System.out.println("The value is : "+ c1.getvalue());
    }
}
