package co.edu.unbosque.service;

import co.edu.unbosque.dao.CustomerDAO;
import co.edu.unbosque.entity.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {

    private final CustomerDAO CustomerDao;

    public CustomerService(CustomerDAO dao) {
        this.CustomerDao = dao;
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return CustomerDao.save(customer);
    }
}
