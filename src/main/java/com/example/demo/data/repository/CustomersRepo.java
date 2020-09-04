package com.example.demo.data.repository;

import com.example.demo.data.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepo extends JpaRepository<Customers, Long> {
}
