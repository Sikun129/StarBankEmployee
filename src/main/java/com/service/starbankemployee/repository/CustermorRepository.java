package com.service.starbankemployee.repository;

import com.service.starbankemployee.entity.NewCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustermorRepository extends JpaRepository<NewCustomer, Long> {
}
