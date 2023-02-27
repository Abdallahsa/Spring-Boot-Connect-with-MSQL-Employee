package com.example.demo.Controller;

import com.example.demo.Entity.Department;
import com.example.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department/")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        return departmentService.findById(id);
    }
    @RequestMapping(value = "/addPerson", method = RequestMethod.POST, headers = "Accept=application/json")
    public Department insert(@RequestBody Department department){
        return departmentService.insert(department);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST, headers = "Accept=application/json")
    public Department update(@RequestBody Department department){
        return departmentService.update(department);
    }
}
