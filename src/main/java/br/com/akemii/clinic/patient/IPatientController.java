package br.com.akemii.clinic.patient;

import br.com.akemii.clinic.patient.model.Patient;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface IPatientController {
    List<Patient> getAllPatients();
    ResponseEntity<Patient> getPatientById(UUID id);
    ResponseEntity<Patient> addPatient(Patient patient);
    ResponseEntity<Patient> updatePatient(UUID id, Patient patientDetails);
    ResponseEntity<Void> deletePatient(UUID id);
}
