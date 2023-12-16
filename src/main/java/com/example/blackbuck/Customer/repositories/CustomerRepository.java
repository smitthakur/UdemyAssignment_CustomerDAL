package com.example.blackbuck.Customer.repositories;

import com.example.blackbuck.Customer.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
