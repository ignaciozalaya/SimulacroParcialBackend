package simu.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simu.parcial.entities.Customer;
import simu.parcial.entities.dto.CustomerDto;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
