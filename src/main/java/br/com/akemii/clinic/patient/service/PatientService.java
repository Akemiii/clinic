package br.com.akemii.clinic.patient.service;

import br.com.akemii.clinic.patient.IPatientService;
import br.com.akemii.clinic.patient.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PatientService implements IPatientService {


    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public Patient getPatientById(UUID id) {
        return null;
    }

    @Override
    public Patient addPatient(Patient patient) {
        return null;
    }

    @Override
    public Patient updatePatient(UUID id, Patient patientDetails) {
        return null;
    }

    @Override
    public void deletePatient(UUID id) {

    }
}
