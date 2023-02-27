package com.example.demo.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findById(id);
    }
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST, headers = "Accept=application/json")
    public Employee insert(@RequestBody Employee employee){
        return employeeService.insert(employee);
    }
    @RequestMapping(value = "/updateE", method = RequestMethod.POST, headers = "Accept=application/json")    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

}
