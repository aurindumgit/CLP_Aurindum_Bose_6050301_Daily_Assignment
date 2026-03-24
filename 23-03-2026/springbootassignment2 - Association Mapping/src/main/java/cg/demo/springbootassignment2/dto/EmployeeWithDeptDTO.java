package cg.demo.springbootassignment2.dto;

// Operation 2: Fetch all employees with dept name and manager name
public class EmployeeWithDeptDTO {

    private int empId;
    private String empName;
    private double salary;
    private String deptName;
    private String managerName;

    public EmployeeWithDeptDTO(int empId, String empName,
                                double salary, String deptName, String managerName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.deptName = deptName;
        this.managerName = managerName;
    }

    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }
    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }
}