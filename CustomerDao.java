package com.example.demo2.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo2.app.entity.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long>{

}