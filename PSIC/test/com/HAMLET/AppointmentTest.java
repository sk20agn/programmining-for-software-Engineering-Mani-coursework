package com.HAMLET;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    void getDetailedTime() {
        Appointment appointment = new Appointment();
        String time = "Thu, 2018 08 12";
        appointment.setDetailedTime(time);

        assertTrue(time == appointment.getDetailedTime());
    }

    @Test
    void setDetailedTime() {

        Appointment appointment = new Appointment();
        String time = "Thu, 2018 08 12";
        appointment.setDetailedTime(time);

        assertEquals(time,appointment.getDetailedTime());

    }

    @Test
    void getPhysicianName() {
        Appointment appointment = new Appointment();
        String name = "Dr. M";
        appointment.setPhysicianName(name);

        assertTrue(name == appointment.getPhysicianName());
    }

    @Test
    void setPhysicianName() {
        Appointment appointment = new Appointment();
        String name = "Dr. A";
        appointment.setPhysicianName(name);

        assertEquals(name,appointment.getPhysicianName());
    }

    @Test
    void getTreatmentName() {
        Appointment appointment = new Appointment();
        String name = "Pool Rehabilitation";
        appointment.setTreatmentName(name);

        assertTrue(name == appointment.getTreatmentName());
    }

    @Test
    void setTreatmentName() {
        Appointment appointment = new Appointment();
        String name = "Pool Rehabilitation";
        appointment.setTreatmentName(name);

        assertEquals(name,appointment.getTreatmentName());

    }

    @Test
    void getPatientName() {
        Appointment appointment = new Appointment();
        String name = "R";
        appointment.setPatientName(name);

        assertTrue(name == appointment.getPatientName());
    }

    @Test
    void setPatientName() {
        Appointment appointment = new Appointment();
        String name = "R";
        appointment.setPatientName(name);

        assertEquals(name,appointment.getPatientName());

    }

    @Test
    void getAppointmentTime() {
        Appointment appointment = new Appointment();
        Date date = new Date();
        appointment.setAppointmentTime(date);

        assertTrue(date == appointment.getAppointmentTime());
    }

    @Test
    void setAppointmentTime() {
        Appointment appointment = new Appointment();
        Date date = new Date();
        appointment.setAppointmentTime(date);

        assertEquals(date,appointment.getAppointmentTime());

    }

    @Test
    void getRoom() {
        Appointment appointment = new Appointment();
        String room = "Medical room !";
        appointment.setRoom(room);

        assertTrue(room == appointment.getRoom());
    }

    @Test
    void setRoom() {
        Appointment appointment = new Appointment();
        String room = "Medical room !";
        appointment.setRoom(room);

        assertEquals(room,appointment.getRoom());
    }

    @Test
    void getResult() {
        Appointment appointment = new Appointment();
        Result result = Result.BOOKED;
        appointment.setResult(result);

        assertTrue(result == appointment.getResult());
    }

    @Test
    void setResult() {
        Appointment appointment = new Appointment();
        Result result = Result.ATTENDED;
        appointment.setResult(result);

        assertEquals(result,appointment.getResult());
    }
}