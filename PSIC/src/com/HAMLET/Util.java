package com.HAMLET;

import java.time.LocalTime;
import java.util.ArrayList;

public class Util {
    private ArrayList<String> days;
    private LocalTime jobTime;
    private String roomId;
    private String consultationTime;
    private ArrayList<String> expertise;

    public Util() {
    }

    public Util(ArrayList<String> days, LocalTime jobTime, String roomId, String consultaionTime, ArrayList<String> expertise) {
        this.days = days;
        this.jobTime = jobTime;
        this.roomId = roomId;
        this.consultationTime = consultaionTime;
        this.expertise = expertise;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }

    public LocalTime getJobTime() {
        return jobTime;
    }

    public void setJobTime(LocalTime jobTime) {
        this.jobTime = jobTime;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getConsultaionTime() {
        return consultationTime;
    }

    public void setConsultaionTime(String consultaionTime) {
        this.consultationTime = consultaionTime;
    }

    public ArrayList<String> getExpertise() {
        return expertise;
    }

    public void setExpertise(ArrayList<String> expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "days=" + days + '\'' +
                ", localTime=" + jobTime + '\'' +
                ", roomId='" + roomId + '\'' +
                ", consultaionTime=" + consultationTime + '\'' +
                ", expertise=" + expertise;
    }
}
