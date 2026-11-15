package com.service.starbankemployee.controller;

import com.service.starbankemployee.entity.NewCustomer;
import com.service.starbankemployee.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cust")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<NewCustomer> getAll(){
        return customerService.getallcustomer();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NewCustomer> getid(@PathVariable Long id){
     return    customerService.getcustomerid(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    @PostMapping
    public ResponseEntity<NewCustomer> update(@Valid @RequestBody NewCustomer customer){
        customerService.createcustomer(customer);
        return ResponseEntity.ok(customer);
    }

}
