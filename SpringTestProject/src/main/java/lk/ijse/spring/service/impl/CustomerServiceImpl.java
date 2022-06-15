package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Tharindu Nilanga
 * @created 6/13/2022
 */
@Service
@Transactional
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void saveCustomer(Customer entity) {
        if (!customerRepo.existsById(entity.getId())) {
           customerRepo.save(entity);
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void updateCustomer(Customer entity) {
        if (customerRepo.existsById(entity.getId())) {
            customerRepo.save(entity);
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }

    }

    @Override
    public void deleteCustomer(String id) {
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }else{
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public Customer searchCustomer(String id) {
        if (customerRepo.existsById(id)){
            return customerRepo.findById(id).get();
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }
}
