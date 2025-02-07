package gabriel.learnspring.spring6restmvc.services;

import gabriel.learnspring.spring6restmvc.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID id) {

        log.debug("Get Customer By Id in service. Id: {}", id.toString());

        return Customer.builder()
                .id(id)
                .customerName("Carlos")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();
    }
}
