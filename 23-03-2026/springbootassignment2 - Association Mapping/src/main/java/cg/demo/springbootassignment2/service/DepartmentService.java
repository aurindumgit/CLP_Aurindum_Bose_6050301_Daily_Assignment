package cg.demo.springbootassignment2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cg.demo.springbootassignment2.dto.DepartmentWiseEmployeeDTO;
import cg.demo.springbootassignment2.entity.Department;
import cg.demo.springbootassignment2.repository.IDepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private IDepartmentRepository repo;

    // Add department
    public Department addDepartment(Department dept) {
        return repo.save(dept);
    }

    // Operation 3: Count employees per department
    public List<DepartmentWiseEmployeeDTO> countEmployeesByDept() {
        return repo.countEmployeesByDepartment();
    }
}