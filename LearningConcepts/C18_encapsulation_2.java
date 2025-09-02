class Volume {
    private int l;
    private int b;
    private int h;

    Volume(int l, int b, int h)
    {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void getArea()
    {
        int volume = l * b*h;
        System.out.println("Volume of cuboid is: " + volume);
    }
}

public class C18_encapsulation_2 {
    public static void main(String[] args)
    {
        Volume cub1 = new Volume(2, 16, 3);
        cub1.getArea();
    }
}
