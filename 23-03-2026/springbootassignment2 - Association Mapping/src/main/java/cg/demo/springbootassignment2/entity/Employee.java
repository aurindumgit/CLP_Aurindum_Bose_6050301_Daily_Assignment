package cg.demo.springbootassignment2.entity;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Employee name cannot be null")
    @NotBlank(message = "Employee name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotNull(message = "Salary cannot be null")
    @Min(value = 1000, message = "Salary must be at least 1000")
    @Max(value = 1000000, message = "Salary cannot exceed 1000000")
    private Double salary;

    @ElementCollection(fetch = FetchType.EAGER)
    @NotNull(message = "Mobile numbers cannot be null")
    private Set<String> mobileNumbers;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    @JsonBackReference
    private Department department;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }
    public Set<String> getMobileNumbers() { return mobileNumbers; }
    public void setMobileNumbers(Set<String> mobileNumbers) { this.mobileNumbers = mobileNumbers; }
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}