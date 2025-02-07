package gabriel.learnspring.spring6restmvc.controller;

import gabriel.learnspring.spring6restmvc.model.Customer;
import gabriel.learnspring.spring6restmvc.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class CustomerController {
    private final CustomerService customerService;

    public Customer getCustomerById(UUID id){

        log.debug("Get Customer By Id in Controller");

        return customerService.getCustomerById(id);
    }
}
