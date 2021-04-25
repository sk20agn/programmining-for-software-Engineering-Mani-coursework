package com.HAMLET;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void getDays() {
        ArrayList<String> days = new ArrayList<>();
        days.add("monday");

        ArrayList<String> exp = new ArrayList<>();
        exp.add("pool");
        Util util = new Util(days, LocalTime.parse("10:00:00"),"A",null,exp);

        assertTrue(days == util.getDays());

    }

    @Test
    void setDays() {
        ArrayList<String> days = new ArrayList<>();
        days.add("monday");

        ArrayList<String> exp = new ArrayList<>();
        exp.add("pool");
        Util util = new Util(days, LocalTime.parse("10:00:00"),"A",null,exp);

        assertEquals(days,util.getDays());
    }

    @Test
    void getJobTime() {
        Util util = new Util();
        LocalTime localTime = LocalTime.now();
        util.setJobTime(LocalTime.now());

        assertTrue(localTime == util.getJobTime());
    }

    @Test
    void setJobTime() {
        Util util = new Util();
        LocalTime localTime = LocalTime.now();
        util.setJobTime(LocalTime.now());

        assertEquals(localTime,util.getJobTime());
    }

    @Test
    void getRoomId() {
        Util util = new Util();
        String time = "Medical Room A";
        util.setRoomId(time);

        assertTrue(time == util.getRoomId());
    }

    @Test
    void setRoomId() {
        Util util = new Util();
        String time = "Medical Room A";
        util.setRoomId(time);

        assertEquals(time,util.getRoomId());
    }

    @Test
    void getConsultaionTime() {
        Util util = new Util();
        String time = "Two hours on monday";
        util.setConsultaionTime(time);

        assertTrue(time == util.getConsultaionTime());
    }

    @Test
    void setConsultaionTime() {
        Util util = new Util();
        String time = "Two hours on monday";
        util.setConsultaionTime(time);

        assertEquals(time,util.getConsultaionTime());

    }

    @Test
    void getExpertise() {
        ArrayList<String> days = new ArrayList<>();
        days.add("monday");

        ArrayList<String> exp = new ArrayList<>();
        exp.add("pool");
        Util util = new Util(days, LocalTime.parse("10:00:00"),"A",null,exp);

        assertTrue(days == util.getDays());
    }

    @Test
    void setExpertise() {
        Util util = new Util();
        ArrayList<String> exp = new ArrayList<>();
        exp.add("pool");
        util.setExpertise(exp);

        assertEquals(exp,util.getExpertise());
    }
}