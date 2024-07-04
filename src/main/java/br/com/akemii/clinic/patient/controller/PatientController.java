package br.com.akemii.clinic.patient.controller;

import br.com.akemii.clinic.patient.IPatientController;
import br.com.akemii.clinic.patient.model.Patient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/patient")
public class PatientController implements IPatientController {
    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public ResponseEntity<Patient> getPatientById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<Patient> addPatient(Patient patient) {
        return null;
    }

    @Override
    public ResponseEntity<Patient> updatePatient(UUID id, Patient patientDetails) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePatient(UUID id) {
        return null;
    }
}
