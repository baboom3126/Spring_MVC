package com.example.demo2.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.app.dao.CustomerDao;
import com.example.demo2.app.entity.Customer;
import com.example.demo2.app.model.CustomerBo;


@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;
    
    public void add(CustomerBo bo) {
        Customer entity = new Customer();
        entity.setId(bo.getId());
        entity.setName(bo.getName());
        entity.setAddress(bo.getAddress());
        customerDao.save(entity);
    }
    
    public CustomerBo get(long id) {
        Customer entity = customerDao.findById(id).orElse(new Customer());
        CustomerBo bo = new CustomerBo();
        bo.setId(entity.getId());
        bo.setName(entity.getName());
        bo.setAddress(entity.getAddress());
        
        return bo;
    }
    
}