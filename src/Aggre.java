class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
class Department {
    String deptName;
    Employee employee;
    Department(String deptName, Employee employee) {
        this.deptName = deptName;
        this.employee = employee;
    }
    void displayDepartment() {
        System.out.println("Department: " + deptName);
        employee.displayEmployee();
    }
}
public class Aggre{
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice");
        Department dept = new Department("HR", emp);
        dept.displayDepartment();
    }
}
