package cg.demo.springbootassignment2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cg.demo.springbootassignment2.dto.EmployeeWithDeptDTO;
import cg.demo.springbootassignment2.dto.EmployeeMobileDTO;
import cg.demo.springbootassignment2.entity.Employee;
import cg.demo.springbootassignment2.service.EmployeeService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Operation 1: Insert employee
    @PostMapping("/add")
    public Employee addEmployee(@Valid @RequestBody Employee emp) {
        return service.insertEmployee(emp);
    }

    // Operation 2: All employees with dept name and manager name
    @GetMapping("/all")
    public List<EmployeeWithDeptDTO> getAll() {
        return service.getAllEmployeesWithDept();
    }

    // Operation 4: Employees by department name
    @GetMapping("/dept/{name}")
    public List<Employee> getByDept(@PathVariable String name) {
        return service.getEmployeesByDeptName(name);
    }

    // Operation 5: Employee details by mobile number
    @GetMapping("/mobile/{num}")
    public List<EmployeeMobileDTO> getByMobile(@PathVariable String num) {
        return service.getEmployeeByMobile(num);
    }
}