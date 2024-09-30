package com.algonquin.cst8288.fall24.assignment1.patient;



import java.time.LocalDate;
import java.time.Period;

import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;


/**
 * 
 * Patient class that holds all patient data. 
 * 
 */

public abstract class Patient implements Admittable {
	
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private long age;
    private String lifeStage;
    private String plannedTreatment;
    private Prescription prescription;


    public Patient(String id, String name, String email, String phoneNumber, LocalDate dateOfBirth2) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth2;
       
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
		return phoneNumber;
	}
    
    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getLifeStage() {
		return lifeStage;
	}

	public void setLifeStage(String lifeStage) {
		this.lifeStage = lifeStage;
	}

	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	public String getPlannedTreatment() {
		return plannedTreatment;
	}

	public void setPlannedTreatment(String plannedTreatment) {
		this.plannedTreatment = plannedTreatment;
	}

	public abstract void admit();

    
}




