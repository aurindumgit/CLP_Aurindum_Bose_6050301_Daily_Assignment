package cg.demo.springbootassignment2.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Department name cannot be null")
    @NotBlank(message = "Department name cannot be blank")
    @Size(min = 2, max = 50, message = "Department name must be between 2 and 50 characters")
    private String name;

    @NotNull(message = "Manager name cannot be null")
    @NotBlank(message = "Manager name cannot be blank")
    @Size(min = 2, max = 50, message = "Manager name must be between 2 and 50 characters")
    private String managerName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Employee> employees;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }
    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
}