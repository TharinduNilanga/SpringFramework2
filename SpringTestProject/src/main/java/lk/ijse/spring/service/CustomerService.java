package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;

import java.util.List;

/**
 * @author Tharindu Nilanga
 * @created 6/13/2022
 */
public interface CustomerService {
    void saveCustomer(Customer entity);
    void updateCustomer(Customer entity);
    void deleteCustomer(String id);
    Customer searchCustomer(String id);
    List<Customer> getAllCustomer();
}
