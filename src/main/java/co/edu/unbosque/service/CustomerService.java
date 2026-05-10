package co.edu.unbosque.service;

import co.edu.unbosque.dao.CustomerDAO;
import co.edu.unbosque.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerService {

    //
    private final CustomerDAO customerDao;

    public CustomerService(CustomerDAO dao) {
        this.customerDao = dao;
    }

    //http//:localhost:8080/andres/gay/create
    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer){
        return customerDao.save(customer);
    }

    //localhost:8080/read
    @GetMapping()
    public List<Customer> findAll(){
        return customerDao.findAll();
    }


    @GetMapping("/{idCustomer}")
    public Customer findById(@PathVariable("idCustomer") Integer id){
        return customerDao.findById(id);
    }


    @DeleteMapping("/{deleteId}")
    public void deleteById(@PathVariable("deleteId") Integer id){
        customerDao.deleteById(id);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        Customer customerDb = customerDao.findById(customer.getId());
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setEmail(customer.getEmail());
        return customerDao.update(customerDb);
    }
}
