package cg.demo.springbootassignment2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import cg.demo.springbootassignment2.dto.DepartmentWiseEmployeeDTO;
import cg.demo.springbootassignment2.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

    // Operation 3: Count employees per department using DTO projection
    @Query("SELECT new cg.demo.springbootassignment2.dto.DepartmentWiseEmployeeDTO(d.name, COUNT(e)) " +
           "FROM Department d LEFT JOIN d.employees e GROUP BY d.name")
    List<DepartmentWiseEmployeeDTO> countEmployeesByDepartment();
}