public class Students {
    int id;
    String name;
    Students(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(id+""+name);         //System.out.println(+id+name); These two are same either you use this syntax or that...
    }
    void set(int id)
    {
        this.id=id;
    }
    void dis()
    {
        System.out.println(+id);
    }
    public static void main(String[] args) {
        Students s1= new Students(444, "Ahmed");
        Students s2= new Students(555, "Ali");
        s1.display();
        s2.display();
        s1.set(22);
        s1.dis();
    }
}
