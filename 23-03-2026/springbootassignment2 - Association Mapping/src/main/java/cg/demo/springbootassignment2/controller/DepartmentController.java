package cg.demo.springbootassignment2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cg.demo.springbootassignment2.dto.DepartmentWiseEmployeeDTO;
import cg.demo.springbootassignment2.entity.Department;
import cg.demo.springbootassignment2.service.DepartmentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    // Add department
    @PostMapping("/add")
    public Department addDepartment(@Valid @RequestBody Department dept) {
        return service.addDepartment(dept);
    }

    // Operation 3: Count employees per department
    @GetMapping("/count")
    public List<DepartmentWiseEmployeeDTO> getEmployeeCount() {
        return service.countEmployeesByDept();
    }
}