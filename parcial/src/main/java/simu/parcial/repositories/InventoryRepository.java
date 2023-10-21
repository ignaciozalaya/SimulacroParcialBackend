package simu.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simu.parcial.entities.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
