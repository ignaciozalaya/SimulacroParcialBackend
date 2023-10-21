package simu.parcial.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import simu.parcial.entities.Address;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

        private String firstName;
        private String lastName;
        private String email;
        private Address address;
        private Long cityId;
        private String postalCode;


}
