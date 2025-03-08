public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    // Constructor with all fields
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    // Constructor with name and ID only
    public Employee(String name, int idNumber) {
        this(name, idNumber, "", "");
    }
    // No-arg constructor
    public Employee() {
        this("", 0, "", "");
    }
    // Mutator (setter) methods
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
    // Accessor (getter) methods
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
    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {
        // Creating Employee objects
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
     // Displaying employee details
        employee1.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();
    }
}
