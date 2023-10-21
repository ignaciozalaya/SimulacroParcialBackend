package simu.parcial.services.mappers;

import org.springframework.stereotype.Service;
import simu.parcial.entities.Customer;
import simu.parcial.entities.dto.CustomerDto;

import java.util.function.Function;
@Service
public class CustomerDtoMapper implements Function<Customer, CustomerDto>{

    @Override
    public CustomerDto apply(Customer customer) {
        return new CustomerDto(
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getAddress().getCityId(),
                customer.getAddress().getPostalCode());
    }

}
