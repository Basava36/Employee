package com.org.employee.controller;

import com.org.employee.model.Employee;
import com.org.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping
    public void create(@RequestBody Employee employee){
    employeeRepo.save(employee);
    }
    @GetMapping
    public List<Employee> get()
    {
        return  employeeRepo.findAll();
    }
    @GetMapping("/get/{Id}")
    public List<Employee> getId(@PathVariable Integer empid)
    {
        return employeeRepo.findByEmpId(empid);
    }
    @PutMapping("/Update/{empadress}")
    public List<Employee> updateSalary(@RequestBody Integer empid,@PathVariable String empadress)
    {
        List<Employee> emp=employeeRepo.findByEmpAdress(empadress);
                for(Employee e:emp)
                {
                    if(e.getEmpadress().equalsIgnoreCase("Chennai"))
                    {
                        double sal=e.getEmpsalary() - 100;
                        e.setEmpsalary(sal);
                        emp.add(e);
                    }
                }
                return employeeRepo.saveAll(emp);
    }

}
