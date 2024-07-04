package br.com.akemii.clinic.patient;

import br.com.akemii.clinic.patient.model.Patient;

import java.util.List;
import java.util.UUID;

public interface IPatientService {
    public List<Patient> getAllPatients();
    public Patient getPatientById(UUID id);
    public Patient addPatient(Patient patient);
    public Patient updatePatient(UUID id, Patient patientDetails);
    public void deletePatient(UUID id);
}
