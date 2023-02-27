package com.example.demo.Service;

import com.example.demo.Entity.Department;
import com.example.demo.Repositiry.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public Department findById(@PathVariable Long id)
    {
        return departmentRepo.findById(id).orElseThrow();
    }
    public Department insert(Department department){
        return departmentRepo.save(department);
    }
    public Department update(Department department){
        Department cur=departmentRepo.findById(department.getId()).get();
        cur.setName(department.getName());
        return departmentRepo.save(cur);
    }

}
