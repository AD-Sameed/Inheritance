public class CH6_1 {
    // Fields (instance variables)
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Constructor that accepts all fields
    public CH6_1(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // Constructor that accepts name and ID number, department and position are empty
    public CH6_1(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    // No-argument constructor that assigns default values
    public CH6_1() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    // Mutator methods (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Accessor methods (getters)
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    // Method to display CH6_1 details
    public void displayCH6_1Info() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println();
    }
}
