package com.algonquin.cst8288.fall24.assignment1.prescription;

import java.util.Date;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * Calculate the details of the prescription according to the business rules.
 * The information to include should cover daily doses, duration, disease type,
 * surgery date, etc.
 */
public class Prescription {
    
    long dailyDosageCount;
    long duration;
    String diseaseType;
    Date surgeryDate;
    String riskFactor;
    boolean isFastingRequired;
    Date followUpDate;
	private Patient patient;

 

    public Prescription() {
        
    }

    
    public long getDailyDosageCount() {
        return dailyDosageCount;
    }

    public long getDuration() {
        return duration;
    }

    public String getDiseaseType() {
        return diseaseType; 
    }

    public Patient getPatient() {
        return getPatient();
    }

    public Date getSurgeryDate() {
        return surgeryDate;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public boolean isFastingRequired() {
        return isFastingRequired;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    
    public void setDailyDosageCount(long dailyDosageCount) {
        this.dailyDosageCount = dailyDosageCount;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient; 
    }

    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public void setFastingRequired(boolean isFastingRequired) {
        this.isFastingRequired = isFastingRequired;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }
}
