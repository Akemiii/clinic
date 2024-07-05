package br.com.akemii.clinic.patient.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientRequestDTO {
    private String name;
    private String cpf;
    private String address;
    private String phoneNumber;
    private String email;
}
