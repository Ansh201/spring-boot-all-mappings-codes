package com.mapping.repository;

import com.mapping.model.Department;
import com.mapping.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    //List<Manager> findManagersByManagerDepartmentId(Long departmentId);

}
