package com.algonquin.cst8288.fall24.assignment1.prescription;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

public class OnlinePrescriptionService implements PrescriptionService {

    
    public String generatePrescription(Patient patient, String treatmentPlanDetails) {
        Prescription prescription = patient.getPrescription();
        StringBuilder htmlContent = new StringBuilder();

        htmlContent.append("<html><body>");
        htmlContent.append("<h1>Prescription</h1>");
        htmlContent.append("<p>Patient Name: ").append(patient.getName()).append("</p>");
        htmlContent.append("<p>Date of Birth: ").append(patient.getDateOfBirth()).append("</p>");
        htmlContent.append("<p>Diagnose: ").append(patient.getPlannedTreatment()).append("</p>");
        htmlContent.append("<h2>Medication Treatment Plan:</h2>");
        htmlContent.append("<p>").append(treatmentPlanDetails).append("</p>");

        htmlContent.append("<h2>Rx:</h2>");
        htmlContent.append("<p>Daily Dosage: ").append(prescription.getDailyDosageCount()).append(" times/day</p>");
        htmlContent.append("<p>Duration: ").append(prescription.getDuration()).append(" days</p>");
        htmlContent.append("<p>Fasting Required: ").append(prescription.isFastingRequired() ? "Yes" : "No").append("</p>");
        htmlContent.append("<p>Follow Up Date: ").append(prescription.getFollowUpDate() != null ? prescription.getFollowUpDate().toString() : "N/A").append("</p>");
        htmlContent.append("</body></html>");

        return htmlContent.toString();
    }

    public void savePrescription(Patient patient, String fileName, String treatmentPlanDetails) throws IOException {
        String prescriptionContent = generatePrescription(patient, treatmentPlanDetails);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(prescriptionContent);
        }
    }
}
