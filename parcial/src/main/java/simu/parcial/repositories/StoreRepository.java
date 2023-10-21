package simu.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simu.parcial.entities.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
