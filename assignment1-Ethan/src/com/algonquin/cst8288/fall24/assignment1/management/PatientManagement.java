package com.algonquin.cst8288.fall24.assignment1.management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;

public class PatientManagement {
    private TreatmentPlan treatmentPlan;
    private PrescriptionService prescriptionService;

    // Constructor
    public PatientManagement(TreatmentPlan treatmentPlan, PrescriptionService prescriptionService) {
        this.treatmentPlan = treatmentPlan;
        this.prescriptionService = prescriptionService;
    }

    public void createTreatmentPlan(Patient patient) {
        // Delegates the treatment plan creation to the treatment plan instance
        String planDetails = treatmentPlan.createTreatmentPlan(patient);
        patient.setPlannedTreatment(planDetails);
    }

    public void generatePrescription(Patient patient, String filename) throws IOException {
        // Delegates the prescription generation to the prescription service instance
        String prescriptionDetails = prescriptionService.generatePrescription(patient);
        try (BufferedWriter bwriter = new BufferedWriter(new FileWriter(filename))) {
            bwriter.write(prescriptionDetails);
        }
    }
}
