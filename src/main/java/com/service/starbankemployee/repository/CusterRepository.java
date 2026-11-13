package com.service.starbankemployee.repository;

import com.service.starbankemployee.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CusterRepository extends JpaRepository<Customer, Long> {
}
