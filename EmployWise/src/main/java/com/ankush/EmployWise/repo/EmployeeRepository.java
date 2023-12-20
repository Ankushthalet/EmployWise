package com.ankush.EmployWise.repo;
import org.apache.el.stream.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ankush.EmployWise.entities.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

	

}
