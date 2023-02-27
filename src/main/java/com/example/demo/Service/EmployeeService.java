package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repositiry.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee findById(@PathVariable Long id){
        return employeeRepo.findById(id).orElseThrow();
    }
    public Employee insert(Employee employee){
       return employeeRepo.save(employee);
    }
    public Employee update(Employee employee){
        Employee cur=employeeRepo.findById(employee.getId()).get();
        cur.setName(employee.getName());
        cur.setSalary(employee.getSalary());
        cur.setDepartment(employee.getDepartment());
        return employeeRepo.save(cur);
    }

}
