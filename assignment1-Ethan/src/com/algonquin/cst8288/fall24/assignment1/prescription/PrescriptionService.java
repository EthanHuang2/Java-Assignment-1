package com.algonquin.cst8288.fall24.assignment1.prescription;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * Generate detailed prescription based on the treatment plan. 
 * 
 * A sample prescription should have a following
 * format
 * 
 * Patient Name: John Doe
 * Date of Birth: 17-10-1987
 * 
 * Diagnose: [Blurb generated by the TreatmentPlan functionalities]
 * 
 * Rx:
 * 
 * Amoxicillin (Antibiotic)
 * Dosage : 2 times/day
 * Duration: 7 days
 * Follow Up: In 1 months
 * .
 * .
 * .
 * 
 * 
 */
public interface PrescriptionService {

	String generatePrescription(Patient patient);
}



