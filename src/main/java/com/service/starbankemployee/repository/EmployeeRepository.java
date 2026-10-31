package com.service.starbankemployee.repository;

import com.service.starbankemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    List<Employee> findByPhonenumber(Long phonenumber);

}
