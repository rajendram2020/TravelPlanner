package com.ibm.travelplanner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.travelplanner.domain.Customer;


public interface CustomerRepositiory extends MongoRepository<Customer, String> { 

}
