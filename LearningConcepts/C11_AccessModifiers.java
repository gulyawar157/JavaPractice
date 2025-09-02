
class myEmployee {
   protected int newid;
    private int id;
    private String name;

    public void setid(int i) {
        id = i;
    }

    public void setname(String n) {
        name = n;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

}

public class C11_AccessModifiers {

    public static void main(String[] args) {
        myEmployee e1 = new myEmployee();

        e1.setid(3491);
        e1.setname("KM John");
        e1.newid = 9;
        System.out.println(e1.newid);

        System.out.println(e1.getid());
        System.out.println(e1.getname());

              mainEmployee e3 = new mainEmployee(322, "KJart");
              e3.id = 2133;
       System.out.println(e3.id);
       System.out.println(e3.name);
    }
}
