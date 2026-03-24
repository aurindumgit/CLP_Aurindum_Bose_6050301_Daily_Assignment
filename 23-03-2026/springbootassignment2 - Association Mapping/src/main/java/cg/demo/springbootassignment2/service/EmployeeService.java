package cg.demo.springbootassignment2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cg.demo.springbootassignment2.dto.EmployeeWithDeptDTO;
import cg.demo.springbootassignment2.dto.EmployeeMobileDTO;
import cg.demo.springbootassignment2.entity.Employee;
import cg.demo.springbootassignment2.exception.DepartmentNameNotFoundException;
import cg.demo.springbootassignment2.exception.MobileNumberDoesNotExistsForEmployeeException;
import cg.demo.springbootassignment2.repository.IEmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository repo;

    // Operation 1: Insert employee
    public Employee insertEmployee(Employee emp) {
        return repo.save(emp);
    }

    // Operation 2: All employees with dept name and manager name
    public List<EmployeeWithDeptDTO> getAllEmployeesWithDept() {
        return repo.getAllEmployeesWithDept();
    }

    // Operation 4: Employees by dept name
    // throws DepartmentNameNotFoundException if no employees found
    public List<Employee> getEmployeesByDeptName(String deptName) {
        List<Employee> list = repo.findByDepartmentName(deptName);
        if (list.isEmpty()) {
            throw new DepartmentNameNotFoundException(
                "No department found with name: " + deptName);
        }
        return list;
    }

    // Operation 5: Employee details by mobile number
    // throws MobileNumberDoesNotExistsForEmployeeException if not found
    public List<EmployeeMobileDTO> getEmployeeByMobile(String mobile) {
        List<EmployeeMobileDTO> list = repo.findEmployeeDetailsByMobile(mobile);
        if (list.isEmpty()) {
            throw new MobileNumberDoesNotExistsForEmployeeException(
                "No employee found with mobile number: " + mobile);
        }
        return list;
    }
}