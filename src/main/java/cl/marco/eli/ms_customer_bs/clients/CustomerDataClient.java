package cl.marco.eli.ms_customer_bs.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.marco.eli.ms_customer_bs.models.dto.CustomerDTO;

@FeignClient(name = "customers-data-service", url = "${ferremas.ms-customers-data.url}")
public interface CustomerDataClient {
    @GetMapping("/data/customers")
    List<CustomerDTO> getAllCustomers();

    @GetMapping("/data/customers/{id}")
    CustomerDTO getCustomerById(@PathVariable("id") Long id);
}
