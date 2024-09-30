package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;
import com.alognquin.cst8288.fall24.assignment1.Constants;

import java.time.LocalDateTime;

public class SurgeryTreatmentPlan implements TreatmentPlan {

    @Override
    public String createTreatmentPlan(Patient patient) {
        StringBuilder treatmentPlan = new StringBuilder();
        int age = patient.calculateAge();  // Use the calculateAge method to get age
        String diagnosis = patient.getPlannedTreatment();

        String riskFactor;
        String fasting;
        String followUp;

        // Determine risk factor, fasting, and follow-up based on age
        if (age < 6) {
            riskFactor = Constants.HIGH;
            fasting = "No Fasting";
            followUp = "Next Day";
        } else if (age >= 6 && age <= 18) {
            riskFactor = Constants.MEDIUM;
            fasting = "2 Hours Before";
            followUp = "In a Week";
        } else {
            riskFactor = Constants.LOW;
            fasting = "8 Hours Before";
            followUp = "In a Month";
        }

        // Constructing the treatment plan narrative
        treatmentPlan.append("Treatment Plan Summary:\n");
        treatmentPlan.append("The patient is diagnosed with ").append(diagnosis).append(".\n");
        treatmentPlan.append("The patient is ").append(age).append(" years old with a risk factor of ").append(riskFactor).append(".\n");
        treatmentPlan.append("It is required to perform a minor surgery in order to address the ").append(diagnosis).append(" issue.\n");
        treatmentPlan.append("Fasting: ").append(fasting).append("\n");
        treatmentPlan.append("Follow Up: ").append(followUp).append("\n");
        treatmentPlan.append("Date and Time of Surgery: ").append(LocalDateTime.now()).append("\n");

        // Create a prescription and set it for the patient
        Prescription prescription = new Prescription();
        prescription.setDiseaseType(diagnosis);
        prescription.setRiskFactor(riskFactor);
        prescription.setFastingRequired(!"No Fasting".equals(fasting));
        prescription.setFollowUpDate(java.sql.Date.valueOf(LocalDateTime.now().plusDays(1).toLocalDate()));

        patient.setPrescription(prescription);

        return treatmentPlan.toString();
    }
}
