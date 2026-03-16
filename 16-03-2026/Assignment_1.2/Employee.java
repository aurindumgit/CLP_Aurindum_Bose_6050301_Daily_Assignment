package springAssignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empA2")
public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private int age;
    private SBU businessUnit;   

    public Employee() {
//        System.out.println("Assignment1 Employee default constructor called");
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public SBU getBusinessUnit() { return businessUnit; }

    public SBU getSbuDetails() {
        return businessUnit;
    }

    @Value("12345")
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Value("Harriet")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Value("40000.0")
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Value("40")
    public void setAge(int age) {
        this.age = age;
    }
    
    @Autowired
    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

    // Display
    public void show() {
        System.out.println("Employee details");
        System.out.println("----------------------");
        System.out.println("Employee [empAge=" + age
                         + ", empId=" + employeeId
                         + ", empName=" + employeeName
                         + ", empSalary=" + salary + "]");
        System.out.println("sbu details=" + getSbuDetails());
    }
}