package com.service.starbankemployee.service;

import com.service.starbankemployee.entity.Employee;
import com.service.starbankemployee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

    public List<Employee> getallemployee(){
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }


    public Employee updateEmployee(Long id,Employee employeeDetails){
        Employee employees = employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id"+ id));

        employees.setFirstname(employeeDetails.getFirstname());
        employees.setMiddlename(employeeDetails.getMiddlename());
        employees.setLastrname(employeeDetails.getLastrname());
        employees.setSurname(employeeDetails.getSurname());
        employees.setGender(employeeDetails.getGender());
        employees.setEmail(employeeDetails.getEmail());
        employees.setPhonenumber(employeeDetails.getPhonenumber());
        employees.setSalary(employeeDetails.getSalary());
        employees.setBranchCode(employeeDetails.getBranchCode());
        employees.setAddress(employeeDetails.getAddress());
        employees.setCity(employeeDetails.getCity());
        employees.setState(employeeDetails.getState());
        employees.setZipcode(employeeDetails.getZipcode());

        return employeeRepository.save(employees);
    }

    public void deleteEmployee(Long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found by id"+ id));
        employeeRepository.delete(employee);


    }




}
