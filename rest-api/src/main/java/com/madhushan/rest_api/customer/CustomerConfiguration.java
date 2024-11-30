package com.madhushan.rest_api.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.fakeCustomerRepo:true}")
    boolean  fakeCustomerRepo;

    @Bean
    CustomerRepo customerRepo(){
        return fakeCustomerRepo ?
                new CustomerFakeRepository():
                new CustomerRepository();


    }



}
