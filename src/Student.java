class Student {
    int id;
    String name;
    void display()
    {
        System.out.println(+id+name);          //System.out.println(id+""+name);   These two are same either you use this syntax or that...

    }
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.display();
        s2.display();
    }
}
