package com.madhushan.rest_api.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
@Primary
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomer() {
        // TODO connect real db
        return Collections.emptyList();
    }
}
