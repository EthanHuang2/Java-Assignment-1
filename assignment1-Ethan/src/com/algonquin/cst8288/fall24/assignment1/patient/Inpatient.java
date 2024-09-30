package com.algonquin.cst8288.fall24.assignment1.patient;

import java.time.LocalDate;

public class Inpatient extends Patient {
    private String roomNumber;

    // Constructor accepting LocalDate for dateOfBirth
    public Inpatient(String id, String name, String email, String phoneNumber, LocalDate dateOfBirth, String roomNumber) {
        super(id, name, email, phoneNumber, dateOfBirth); // Call to the Patient constructor
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

	@Override
	public void admit() {
	
		
	}
}
