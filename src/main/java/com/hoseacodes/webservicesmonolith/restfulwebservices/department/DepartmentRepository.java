package com.hoseacodes.webservicesmonolith.restfulwebservices.department;

import com.hoseacodes.webservicesmonolith.restfulwebservices.department.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}