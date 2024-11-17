package com.ecommerce.Ecommerce.RepositporyInterface;

import com.ecommerce.Ecommerce.ModelClass.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
