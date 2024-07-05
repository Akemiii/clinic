package br.com.akemii.clinic.patient.mapper;

import br.com.akemii.clinic.patient.dto.PatientRequestDTO;
import br.com.akemii.clinic.patient.dto.PatientResponseDTO;
import br.com.akemii.clinic.patient.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {

    public PatientResponseDTO toResponseDTO(Patient patient){
        return PatientResponseDTO.builder()
                .id(patient.getPatientId())
                .name(patient.getName())
                .cpf(patient.getCpf())
                .address(patient.getAddress())
                .phoneNumber(patient.getPhoneNumber())
                .email(patient.getEmail())
                .build();
    }

    public Patient toEntity(PatientRequestDTO patientRequestDTO){
        return Patient.builder()
                .name(patientRequestDTO.getName())
                .cpf(patientRequestDTO.getCpf())
                .address(patientRequestDTO.getAddress())
                .phoneNumber(patientRequestDTO.getPhoneNumber())
                .email(patientRequestDTO.getEmail())
                .build();
    }

}
