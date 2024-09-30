package com.algonquin.cst8288.fall24.assignment1.management;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;
import com.algonquin.cst8288.fall24.assignment1.treatment.TreatmentPlan;

public class CreateTreatmentPlan {
    // Instance of PatientAgeCalc
    private PatientAgeCalc ageCalc;  
    
    public CreateTreatmentPlan(Patient patient, TreatmentPlan treatmentPlan) {
        this.ageCalc = new PatientAgeCalc();
        
        patient.setAge(ageCalc.calculatePatientAge(patient.getDateOfBirth()));
        patient.setLifeStage(ageCalc.determineLifeStage(patient.getAge())); 
        patient.setPlannedTreatment(treatmentPlan.createTreatmentPlan(patient));
    }
}
