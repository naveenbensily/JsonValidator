package com.demo.jsonvalidator.repository;

/**
 * Created by Naveen Bensily on 5/30/15.
 */

import com.demo.jsonvalidator.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}