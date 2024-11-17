package com.ecommerce.Ecommerce.ServiceClass;

import com.ecommerce.Ecommerce.ModelClass.Customer;
import com.ecommerce.Ecommerce.RepositporyInterface.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
