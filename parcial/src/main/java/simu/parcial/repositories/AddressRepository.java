package simu.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simu.parcial.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
