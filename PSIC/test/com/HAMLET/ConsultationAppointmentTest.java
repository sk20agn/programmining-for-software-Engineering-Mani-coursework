package com.HAMLET;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ConsultationAppointmentTest {

    @Test
    void getPhysicianName() {
        ConsultationAppointment appointment = new ConsultationAppointment();
        String name = "Dr. H";
        appointment.setPhysicianName(name);

        assertTrue(name == appointment.getPhysicianName());
    }

    @Test
    void setPhysicianName() {
        ConsultationAppointment appointment = new ConsultationAppointment();
        String name = "Dr. H";
        appointment.setPhysicianName(name);


        assertEquals(name,appointment.getPhysicianName());
    }

    @Test
    void getVisitorName() {
        ConsultationAppointment appointment = new ConsultationAppointment();
        String name = "R";
        appointment.setVisitorName(name);

        assertTrue(name == appointment.getVisitorName());

    }

    @Test
    void setVisitorName() {
        ConsultationAppointment appointment = new ConsultationAppointment();
        String name = "Dr. H";
        appointment.setVisitorName(name);


        assertEquals(name,appointment.getVisitorName());

    }

    @Test
    void getAppointmentTime() {
        ConsultationAppointment appointment = new ConsultationAppointment();
        Date date = new Date();
        appointment.setAppointmentTime(date);

        assertTrue(date == appointment.getAppointmentTime());

    }

    @Test
    void setAppointmentTime() {
        ConsultationAppointment appointment = new ConsultationAppointment();
        Date date = new Date();
        appointment.setAppointmentTime(date);


        assertEquals(date,appointment.getAppointmentTime());

    }
}