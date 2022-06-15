package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tharindu Nilanga
 * @created 6/13/2022
 */
public interface CustomerRepo extends JpaRepository<Customer,String> {
}
