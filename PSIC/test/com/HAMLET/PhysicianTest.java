package com.HAMLET;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PhysicianTest extends Member {

    @Test
    void getUtil() {
        ArrayList<String> expertise = new ArrayList<>();
        expertise.add("Consultant Physician");
        expertise.add("Internal Medicine Specialist");
        expertise.add("Hepatologist");
        expertise.add("Gastroenterologist");
        expertise.add("Family Physician");
        ArrayList<String> days = new ArrayList<>();
        days.add("Tuesday");
        days.add("Wednesday");
        Util util = new Util(days, LocalTime.parse("10:00:00"), "Medical Consulting room A", "2 hours on Monday Afternoon", expertise);

        Physician physician = new Physician();
        physician.setUtil(util);

        assertTrue(util == physician.getUtil());

    }

    @Test
    void setUtil() {
        ArrayList<String> expertise = new ArrayList<>();
        expertise.add("Consultant Physician");
        expertise.add("Internal Medicine Specialist");
        expertise.add("Hepatologist");
        expertise.add("Gastroenterologist");
        expertise.add("Family Physician");
        ArrayList<String> days = new ArrayList<>();
        days.add("Tuesday");
        days.add("Wednesday");
        Util util = new Util(days, LocalTime.parse("10:00:00"), "Medical Consulting room A", "2 hours on Monday Afternoon", expertise);

        Physician physician = new Physician();
        physician.setUtil(util);

        assertEquals(util,physician.getUtil());
    }
}