package simu.parcial.implementation;

import org.springframework.stereotype.Service;
import simu.parcial.entities.Address;
import simu.parcial.entities.Customer;
import simu.parcial.entities.dto.CustomerDto;
import simu.parcial.repositories.AddressRepository;
import simu.parcial.repositories.CustomerRepository;
import simu.parcial.services.CustomerService;
import simu.parcial.services.mappers.CustomerDtoMapper;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDtoMapper customerDtoMapper;
    private final AddressRepository addressRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerDtoMapper customerDtoMapper, AddressRepository addressRepository) {
        this.customerRepository = customerRepository;
        this.customerDtoMapper = customerDtoMapper;
        this.addressRepository = addressRepository;
    }

    @Override
    public void add(CustomerDto entity) {
        Customer customer = new Customer();
        customer.setFirstName(entity.getFirstName());
        customer.setLastName(entity.getLastName());
        customer.setEmail(entity.getEmail());

        // Obtener la dirección desde la base de datos
        Address address = addressRepository.findById(entity.getCityId()).orElse(null);
        if (address == null) {
            // Manejar el caso en el que no se encuentra la dirección
            // Puedes lanzar una excepción o tomar otra acción apropiada
        } else {
            customer.setAddress(address);

        }
        this.customerRepository.save(customer);
    }

    @Override
    public void update(CustomerDto entity) {

        //customerRepository.save();

    }

    @Override
    public CustomerDto delete(Long aLong) {
        return null;
    }

    @Override
    public CustomerDto getById(Long aLong) {
        return null;
    }

    @Override
    public List<CustomerDto> getAll() {
        return null;
    }
}
