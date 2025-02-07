package gabriel.learnspring.spring6restmvc.services;

import gabriel.learnspring.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);
}
