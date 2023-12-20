package com.ankush.EmployWise.services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Sort;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ankush.EmployWise.entities.Employee;
import com.ankush.EmployWise.repo.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(String id, Employee updatedEmployee) {
        if (employeeRepository.existsById(id)) {
            updatedEmployee.setId(id);
            return employeeRepository.save(updatedEmployee);
        }
        return null; // Handle the case where the employee with the given ID doesn't exist
    }
    
    //-------------------------------------- intermediate----------------------------------------------------
    
    public Optional<Employee> getNthLevelManager(String employeeId, int level) {
        Optional<Employee> employeeOptional = getEmployeeById(employeeId);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            String managerId = employee.getReportsTo();

            for (int i = 1; i < level && managerId != null; i++) {
                Optional<Employee> managerOptional = getEmployeeById(managerId);
                if (managerOptional.isPresent()) {
                    managerId = managerOptional.get().getReportsTo();
                } else {
                    break; // Handle the case where manager is not found
                }
            }

            return getEmployeeById(managerId);
        }

        return Optional.empty();
    }

    public List<Employee> getEmployeesWithPaginationAndSorting(int page, int size, String sortBy) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
        Page<Employee> employeePage = employeeRepository.findAll(pageRequest);
        return employeePage.getContent();
    }
    
}
