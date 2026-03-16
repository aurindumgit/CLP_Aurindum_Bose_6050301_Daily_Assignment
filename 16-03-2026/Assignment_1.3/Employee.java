package springAssignment3;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private int age;

    // Default Constructor
    public Employee() {
//        System.out.println("Employee default constructor called");
    }

    // Getters
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    // Setters — no annotations, XML will inject
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [empAge=" + age
             + ", empId=" + employeeId
             + ", empName=" + employeeName
             + ", empSalary=" + salary + "]";
    }
}