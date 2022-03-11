package internal.dao;

import internal.entity.Employee;

import java.util.Collection;

public interface EmployeeDAO {
    Employee getByID(int id);
    boolean save(Employee em);
    Collection<Employee> getAllOU();
    boolean update(Employee employee);
    boolean delete(Employee employee);
    boolean delete(int id);
}
