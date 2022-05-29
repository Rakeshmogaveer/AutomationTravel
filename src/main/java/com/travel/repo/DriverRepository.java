package com.travel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
