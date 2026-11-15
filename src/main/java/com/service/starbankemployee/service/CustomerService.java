package com.service.starbankemployee.service;

import com.service.starbankemployee.entity.NewCustomer;
import com.service.starbankemployee.repository.CustermorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private CustermorRepository customerRepository;

    public List<NewCustomer> getallcustomer(){
        return customerRepository.findAll();
    }
    public Optional<NewCustomer>  getcustomerid(Long id){
        return customerRepository.findById(id);
    }

    public NewCustomer createcustomer(NewCustomer customer){
        return customerRepository.save(customer);
    }

}
