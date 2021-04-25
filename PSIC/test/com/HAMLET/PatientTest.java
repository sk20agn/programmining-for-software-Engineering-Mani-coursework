package com.HAMLET;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest extends Member {

    @Test
    void getAppointmentTime() {
        Patient patient = new Patient();
        LocalDateTime dateTime = LocalDateTime.now();
        patient.setAppointmentTime(dateTime);

        assertTrue(dateTime == patient.getAppointmentTime());
    }

    @Test
    void setAppointmentTime() {
        Patient patient = new Patient();
        LocalDateTime dateTime = LocalDateTime.now();
        patient.setAppointmentTime(dateTime);

        assertEquals(dateTime,patient.getAppointmentTime());
    }
}