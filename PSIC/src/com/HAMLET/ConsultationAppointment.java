package com.HAMLET;

import java.util.Date;

public class ConsultationAppointment {
    private String physicianName;
    private String visitorName;
    private Date appointmentTime;

    public ConsultationAppointment(String physicianName, String visitorName, Date appointmentTime) {
        this.physicianName = physicianName;
        this.visitorName = visitorName;
        this.appointmentTime = appointmentTime;
    }

    public ConsultationAppointment() {

    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    @Override
    public String toString() {
        return "physicianName='" + physicianName + '\'' +
                ", visitorName='" + visitorName + '\'' +
                ", appointmentTime=" + appointmentTime;
    }
}
