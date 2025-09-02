class myEmployee{
    private int id;
    private String name;

    public void setid(int i){
        id = i;
    }
    public void setname(String n){
        name = n;
    }

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

}

public class C18_encapsulation {

    public static void main(String[] args) {
          myEmployee e1 = new myEmployee();

    e1.setid(3491);
    e1.setname("KM John");

    System.out.println(e1.getid());
    System.out.println(e1.getname());
    }
}
