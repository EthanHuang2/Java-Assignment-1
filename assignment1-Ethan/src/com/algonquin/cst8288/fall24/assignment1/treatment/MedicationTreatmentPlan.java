package com.algonquin.cst8288.fall24.assignment1.treatment;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;
import com.alognquin.cst8288.fall24.assignment1.Constants;

public class MedicationTreatmentPlan implements TreatmentPlan {

    @Override
    public String createTreatmentPlan(Patient patient) {
        StringBuilder treatmentPlan = new StringBuilder();
        String lifeStage = patient.getLifeStage();
        String diagnosis = patient.getPlannedTreatment(); // Assuming this is set somewhere before calling

        // Determine dosage frequency based on life stage
        int dosageFrequency = 0;
        switch (lifeStage) {
            case Constants.CHILD:
                dosageFrequency = 1; // 1 time per day
                break;
            case Constants.YOUTH:
                dosageFrequency = 2; // 2 times per day
                break;
            case Constants.ADULT:
                dosageFrequency = 3; // 3 times per day
                break;
        }

        // Determine duration based on diagnosis
        long duration = 0;
        if (Constants.ACUTE.equals(diagnosis)) {
            duration = Constants.ACUTE_DURATION;
        } else if (Constants.INFECTION.equals(diagnosis)) {
            duration = Constants.INFECTION_DURATION;
        } else if (Constants.CHRONIC.equals(diagnosis)) {
            duration = Constants.CHRONIC_DURATION;
        }

        // Build treatment plan string
        treatmentPlan.append("Medication Treatment Plan:\n");
        treatmentPlan.append("Diagnosis: ").append(diagnosis).append("\n");
        treatmentPlan.append("Dosage Frequency: ").append(dosageFrequency).append(" times per day\n");
        treatmentPlan.append("Duration: ").append(duration).append(" days\n");

        // Create and set the prescription
        Prescription prescription = new Prescription();
        prescription.setDiseaseType(diagnosis);
        prescription.setDailyDosageCount(dosageFrequency);
        prescription.setDuration(duration);
        prescription.setPatient(patient); // Set the patient
        
        patient.setPrescription(prescription); // Associate the prescription with the patient

        return treatmentPlan.toString();
    }
}
