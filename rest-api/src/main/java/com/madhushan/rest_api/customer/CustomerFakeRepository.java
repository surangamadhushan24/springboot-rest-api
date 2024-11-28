package com.madhushan.rest_api.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "Fake")
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomer() {
        return Arrays.asList(
                new Customer(1L,"Trump"),
                new Customer(1L,"Nate")
        );
    }
}
