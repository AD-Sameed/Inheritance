public class Pen {
    private int red ,green ,blue;
    public void getRGBColor(int red, int green,int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public void display()
    { 
        System.out.println(red+" "+green+" "+blue);
    }
    public static void main(String[] args) 
    {
        Pen p1=new Pen();
        p1.getRGBColor(42, 34, 45);
        p1.display();
    }
}
