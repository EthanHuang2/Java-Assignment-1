package com.alognquin.cst8288.fall24.assignment1;

import com.algonquin.cst8288.fall24.assignment1.patient.Inpatient;
import com.algonquin.cst8288.fall24.assignment1.patient.Outpatient;
import com.algonquin.cst8288.fall24.assignment1.prescription.OnlinePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.prescription.PrintablePrescriptionService;
import com.algonquin.cst8288.fall24.assignment1.treatment.MedicationTreatmentPlan;
import com.algonquin.cst8288.fall24.assignment1.treatment.SurgeryTreatmentPlan;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// ... other imports

public class Physician {
    public static void main(String[] args) {
        // Instantiate Patients with LocalDate
        LocalDate johnsBirthDate = LocalDate.parse("2000-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        Inpatient inpatient = new Inpatient("1", "John Doe", "john@example.com", "1234567890", johnsBirthDate, "Room 101");
        inpatient.setPlannedTreatment("Infection Disease");
        inpatient.setLifeStage("Adult");

        LocalDate janesBirthDate = LocalDate.parse("2005-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        Outpatient outpatient = new Outpatient("2", "Jane Doe", "jane@example.com", "0987654321", janesBirthDate, "2024-10-01");
        outpatient.setPlannedTreatment("Acute Disease");
        outpatient.setLifeStage("Youth");

        // Create Treatment Plans
        MedicationTreatmentPlan medicationPlan = new MedicationTreatmentPlan();
        SurgeryTreatmentPlan surgeryPlan = new SurgeryTreatmentPlan();
        
        String outpatientPlanDetails = medicationPlan.createTreatmentPlan(outpatient);
        String inpatientPlanDetails = surgeryPlan.createTreatmentPlan(inpatient);

        // Generate prescriptions
        OnlinePrescriptionService onlineService = new OnlinePrescriptionService();
        PrintablePrescriptionService printableService = new PrintablePrescriptionService();
        try {
            onlineService.savePrescription(outpatient, "jane_doe_prescription.html", outpatientPlanDetails);
            printableService.savePrescription(outpatient, "jane_doe_prescription.txt", outpatientPlanDetails);
            System.out.println("Outpatient prescriptions saved successfully!");

            onlineService.savePrescription(inpatient, "john_doe_prescription.html", inpatientPlanDetails);
            printableService.savePrescription(inpatient, "john_doe_prescription.txt", inpatientPlanDetails);
            System.out.println("Inpatient prescriptions saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving prescriptions: " + e.getMessage());
        }
    }
}
