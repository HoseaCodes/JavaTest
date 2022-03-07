package com.hoseacodes.webservicesmonolith.restfulwebservices.department;

import com.hoseacodes.webservicesmonolith.restfulwebservices.department.Department;
import com.hoseacodes.webservicesmonolith.restfulwebservices.department.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department) {
        // log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        // log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }

}