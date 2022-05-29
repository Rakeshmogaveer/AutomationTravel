package com.travel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
