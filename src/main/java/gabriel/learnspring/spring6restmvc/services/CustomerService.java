package gabriel.learnspring.spring6restmvc.services;

import gabriel.learnspring.spring6restmvc.model.Customer;

import java.util.UUID;

public interface CustomerService {

    Customer getCustomerById(UUID id);
}
