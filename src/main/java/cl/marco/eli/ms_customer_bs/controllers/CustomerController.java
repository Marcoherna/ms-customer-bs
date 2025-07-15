package cl.marco.eli.ms_customer_bs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.marco.eli.ms_customer_bs.clients.CustomerDataClient;
import cl.marco.eli.ms_customer_bs.models.dto.CustomerDTO;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerDataClient customerDataClient;

    @GetMapping
    public List<CustomerDTO> getAllCustomers() {
        // Aquí irían las reglas de negocio, si las hubiera.
        return customerDataClient.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id) {
        CustomerDTO customer = customerDataClient.getCustomerById(id);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}