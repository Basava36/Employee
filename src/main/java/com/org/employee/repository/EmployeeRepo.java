package com.org.employee.repository;

import com.org.employee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,Integer> {
    List<Employee> findByEmpId(Integer empid);

    List<Employee> findByEmpAdress(String empadress);
}
