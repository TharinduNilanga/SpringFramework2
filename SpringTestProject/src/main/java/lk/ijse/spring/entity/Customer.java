package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Tharindu Nilanga
 * @created 6/13/2022
 */
@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
