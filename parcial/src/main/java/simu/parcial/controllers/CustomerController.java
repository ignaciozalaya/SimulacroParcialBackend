package simu.parcial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import simu.parcial.entities.dto.CustomerDto;
import simu.parcial.services.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    //add
    @PostMapping
    private ResponseEntity<Void> add(@RequestBody CustomerDto customer) {
        customerService.add(customer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }








}
