package cg.demo.springbootassignment2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import cg.demo.springbootassignment2.dto.EmployeeWithDeptDTO;
import cg.demo.springbootassignment2.dto.EmployeeMobileDTO;
import cg.demo.springbootassignment2.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    // Operation 2: DTO query — use plain JOIN (not FETCH)
    @Query("SELECT new cg.demo.springbootassignment2.dto.EmployeeWithDeptDTO" +
           "(e.id, e.name, e.salary, e.department.name, e.department.managerName) " +
           "FROM Employee e LEFT JOIN e.department")
    List<EmployeeWithDeptDTO> getAllEmployeesWithDept();

    // Operation 4: full entity query — JOIN FETCH is fine here
    @Query("SELECT e FROM Employee e JOIN FETCH e.department d WHERE d.name = :deptName")
    List<Employee> findByDepartmentName(@Param("deptName") String deptName);

    // Operation 5: DTO query — use plain JOIN (not FETCH)
    @Query("SELECT new cg.demo.springbootassignment2.dto.EmployeeMobileDTO" +
           "(e.id, e.name, e.department.name, e.department.managerName) " +
           "FROM Employee e JOIN e.department JOIN e.mobileNumbers m WHERE m = :mobile")
    List<EmployeeMobileDTO> findEmployeeDetailsByMobile(@Param("mobile") String mobile);
}