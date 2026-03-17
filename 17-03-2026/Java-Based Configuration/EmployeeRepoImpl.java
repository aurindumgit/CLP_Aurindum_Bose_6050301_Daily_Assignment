package springAssignment4;

import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo {

    private Map<Integer, Employee> mp = new HashMap<>();

    public EmployeeRepoImpl() {
        mp.put(1, new Employee(1, "Auri", "CSE"));
        mp.put(2, new Employee(2, "Adi", "IT"));
        mp.put(3, new Employee(3, "Aman", "ECE"));
    }

    @Override
    public void insert(Employee emp) {
        mp.put(emp.getId(), emp);
    }

    @Override
    public Employee fetchById(int id) {
        return mp.get(id);
    }

    @Override
    public List<Employee> fetchAll() {
        return new ArrayList<>(mp.values());
    }

    @Override
    public void update(Employee emp) {
        if (mp.containsKey(emp.getId())) {
            mp.put(emp.getId(), emp);
        } else {
            System.out.println("Employee ID not found");
        }
    }

    @Override
    public void delete(int id) {
        if (mp.containsKey(id)) {
            mp.remove(id);
        } else {
            System.out.println("Employee ID not found");
        }
    }
}