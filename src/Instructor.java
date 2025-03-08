public class Instructor
{
private String lastName;
private String firstName;
private String officeNumber;
public Instructor(String lname, String fname,
String office)
{
lastName = lname;
firstName = fname;
officeNumber = office;
System.out.println("Last Name:"+lastName);
System.out.println("First Name:"+firstName);
System.out.println("Office Number:"+officeNumber);


}
public Instructor(Instructor object2)
{
lastName = object2.lastName;
firstName = object2.firstName;
officeNumber = object2.officeNumber;
System.out.println("Last Name:"+lastName);
System.out.println("First Name:"+firstName);
System.out.println("Office Number:"+officeNumber);

}
public void set(String lname, String fname,
String office)
{
lastName = lname;
firstName = fname;
officeNumber = office;
}
public static void main(String[] args) {
    Instructor aggreagation = new Instructor("Admed","Ali","14321");
    Instructor aggreagation2 = new Instructor("Subhan","Khan","00000");

    Instructor aggreagation3 = aggreagation2;
}
}