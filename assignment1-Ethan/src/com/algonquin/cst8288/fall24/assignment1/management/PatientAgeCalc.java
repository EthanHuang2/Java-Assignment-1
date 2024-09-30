package com.algonquin.cst8288.fall24.assignment1.management;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import com.alognquin.cst8288.fall24.assignment1.Constants;

public class PatientAgeCalc {

    /**
     * Calculate patient age based on date of birth
     * 
     * @param dob Date of birth in "yyyy-MM-dd" format
     * @return Calculated age
     */
    public long calculatePatientAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate dateOfBirth = LocalDate.parse(dob, formatter);
            LocalDate currentDate = LocalDate.now();
            return Period.between(dateOfBirth, currentDate).getYears();
        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
            return -1; // Handle error gracefully
        }
    }
    
    /**
     * Determine life stage based on age
     * 
     * @param age Age of the patient
     * @return Life stage as a String
     */
    public String determineLifeStage(long age) {
        return (age <= 6) ? Constants.CHILD : 
               (age <= 18) ? Constants.YOUTH : 
               Constants.ADULT;   
    }
}
