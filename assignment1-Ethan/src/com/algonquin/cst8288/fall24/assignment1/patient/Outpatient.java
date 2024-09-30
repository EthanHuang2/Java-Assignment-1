package com.algonquin.cst8288.fall24.assignment1.patient;

import java.time.LocalDate;

public class Outpatient extends Patient {
    private String appointmentDate;

    
    public Outpatient(String id, String name, String email, String phoneNumber, LocalDate dateOfBirth, String appointmentDate) {
        super(id, name, email, phoneNumber, dateOfBirth); 
        this.appointmentDate = appointmentDate; 
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }
    @Override
    public void admit() {
        // Outpatients do not require admission; this can be a no-op
        System.out.println(getName() + " is scheduled for an appointment on " + getAppointmentDate());
    }
}
