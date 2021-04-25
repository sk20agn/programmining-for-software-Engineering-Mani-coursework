package com.HAMLET;

import java.time.LocalDateTime;

public class Patient extends Member {
    private LocalDateTime appointmentTime;

    public Patient(String id, String fullName, String address, String telephoneNumber, LocalDateTime appointmentTime) {
        super(id, fullName, address, telephoneNumber);
        this.appointmentTime = appointmentTime;
    }

    public Patient() {
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        return super.toString()
                + '\'' + ", appointmentTime='" + appointmentTime + '\'';
    }
}
