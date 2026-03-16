package springAssignment1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empA1")
public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private String businessUnit;
    private int age;

    public Employee() {
//        System.out.println("Assignment1 Employee default constructor called");
    }

    // Getters
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getBusinessUnit() { return businessUnit; }
    public int getAge() { return age; }

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

    @Value("PES-BU")
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Value("30")
    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("Employee details");
        System.out.println("----------------------");
        System.out.println("Employee ID     : " + employeeId);
        System.out.println("Employee Name   : " + employeeName);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee BU     : " + businessUnit);
        System.out.println("Employee Age    : " + age);
    }
}