package simu.parcial.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "store")
public class Store {
    @Id
    @Column(name = "store_id")
    private Long storeId;
    @Column(name = "manager_staff_id")
    private Long managerStaffId;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
