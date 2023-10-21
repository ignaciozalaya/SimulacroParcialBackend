package simu.parcial.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "address_id")
    private Long addressId;
    private String address;
    private String address2;
    private String district;
    @Column(name = "city_id")
    private Long cityId;
    @Column(name = "postal_code")
    private String postalCode;
    private String phone;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
