package com.sravani.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sravani.springbatch.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
