package co.edu.unbosque.dao;

import co.edu.unbosque.entity.Customer;
import co.edu.unbosque.persistence.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDAO implements DAO<Customer> {

    private final CustomerRepository customerRepository;

    public CustomerDAO(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }
}
