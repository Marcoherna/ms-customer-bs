package cl.marco.eli.ms_customer_bs.repositories;

import cl.marco.eli.ms_customer_bs.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}