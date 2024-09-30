package com.algonquin.cst8288.fall24.assignment1.prescription;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

public class PrintablePrescriptionService implements PrescriptionService {


    public String generatePrescription(Patient patient, String treatmentPlanDetails) {
        Prescription prescription = patient.getPrescription();
        StringBuilder textContent = new StringBuilder();

        textContent.append("Printable Prescription\n");
        textContent.append("Patient Name: ").append(patient.getName()).append("\n");
        textContent.append("Date of Birth: ").append(patient.getDateOfBirth()).append("\n");
        textContent.append("Diagnose: ").append(patient.getPlannedTreatment()).append("\n");
        textContent.append("Medication Treatment Plan:\n").append(treatmentPlanDetails).append("\n");
        
        textContent.append("Rx:\n");
        textContent.append("Daily Dosage: ").append(prescription.getDailyDosageCount()).append(" times/day\n");
        textContent.append("Duration: ").append(prescription.getDuration()).append(" days\n");
        textContent.append("Fasting Required: ").append(prescription.isFastingRequired() ? "Yes" : "No").append("\n");
        textContent.append("Follow Up Date: ").append(prescription.getFollowUpDate() != null ? prescription.getFollowUpDate().toString() : "N/A").append("\n");

        return textContent.toString();
    }

    public void savePrescription(Patient patient, String fileName, String treatmentPlanDetails) throws IOException {
        String prescriptionContent = generatePrescription(patient, treatmentPlanDetails);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(prescriptionContent);
        }
    }
}
