package com.service.starbankemployee.controller;

import com.service.starbankemployee.entity.Employee;
import com.service.starbankemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")

public class EmployesController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/emp2")
    public List<Employee> getAllEmployees(){

        return employeeService.getallemployee();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
           return employeeService.getEmployeeById(id)
                   .map(ResponseEntity::ok)
                   .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

//    @PostMapping
//    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee){
//        Employee newEmployee = employeeService.createEmployee(employee);
//        return ResponseEntity.status(HttpStatus.CREATED).body(newEmployee);
//
//    }

    @PostMapping
        public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
            employeeService.saveEmployee(employee);
            return  ResponseEntity.ok("Ready Employee Table");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee employeeDetails,
                                                 @PathVariable Long id){
      Employee updateEmployee =  employeeService.updateEmployee(id , employeeDetails);
        return  ResponseEntity.ok("Employee Table is Updated");

    }
    @DeleteMapping
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return  ResponseEntity.ok("Employee Table is Deleted");
    }

    

}
