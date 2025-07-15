package cl.marco.eli.ms_customer_bs.models.dto;

public record CustomerDTO(
    Long id,
    String email,
    String firstName,
    String lastName
) {
    
}
