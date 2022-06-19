package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

/**
 * @author Tharindu Nilanga
 * @created 6/13/2022
 */
public interface CustomerService {
    void saveCustomer(CustomerDTO entity);
    void updateCustomer(CustomerDTO entity);
    void deleteCustomer(String id);
    CustomerDTO searchCustomer(String id);
    List<CustomerDTO> getAllCustomer();
}
