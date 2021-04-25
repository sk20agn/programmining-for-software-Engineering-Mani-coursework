package com.HAMLET;
import java.util.Date;

public class Appointment {
    private String physicianName;
    private String treatmentName;
    private String patientName;
    private Date appointmentTime;
    private String room;
    private Result result;
    private String detailedTime;

    public Appointment(String physicianName, String treatmentName, String patientName, Date appointmentTime, String room, Result result,String detailedTime) {
        this.physicianName = physicianName;
        this.treatmentName = treatmentName;
        this.patientName = patientName;
        this.appointmentTime = appointmentTime;
        this.room = room;
        this.result = result;
        this.detailedTime = detailedTime;
    }

    public Appointment() {
    }

    public String getDetailedTime() {
        return detailedTime;
    }

    public void setDetailedTime(String detailedTime) {
        this.detailedTime = detailedTime;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "physicianName='" + physicianName + '\'' +
                ", treatmentName='" + treatmentName + '\'' +
                ", patientName='" + patientName + '\'' +
                ", appointmentTime=' " + detailedTime + '\'' +
                ", room='" + room + '\'' +
                ", result=" + result;
    }
}
