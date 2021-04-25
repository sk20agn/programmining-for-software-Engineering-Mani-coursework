package com.HAMLET;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static com.HAMLET.Main.*;

public interface EXTRA {

    static String getTimeSpan(int number) {
        switch (number) {
            case 0:
                return "10 to 12";
            case 1:
                return "12 to 2";
            case 2:
                return "2 to 4";
        }
        return "";
    }

    static String getHour(String time) {
        return String.valueOf(time.charAt(0)) + String.valueOf(time.charAt(1));
    }


    static Util getUtil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of your sitting (Enter OK when you are done) ) : ");
        ArrayList<String> days = new ArrayList<>();
        String day = scanner.nextLine();
        while (!day.equals("OK")){
            days.add(day);
            System.out.print("Enter day of your sitting (Enter OK when you are done) ) : ");
            day = scanner.nextLine();
        }

        System.out.print("Enter your Consultation Time (like 2 hours on Thursday afternoon) : ");
        String conTime = scanner.nextLine();

        System.out.print("Enter your expertise (Enter OK when you are done) ) : ");
        ArrayList<String> expertise = new ArrayList<>();
        String expert = scanner.nextLine();
        while (!expert.equals("OK")){
            expertise.add(expert);
            System.out.print("Enter your expertise (Enter OK when you are done) ) : ");
            expert = scanner.nextLine();
        }

        System.out.print("Enter your room Id according to expertise : ");
        String roomId = scanner.nextLine();

        return new Util(days, LocalTime.parse("10:00:00"),roomId,conTime,expertise);
    }

    static Member getMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your id (Your id should be unique) : ");
        String id = scanner.nextLine();
        if(isIdExists(id)){
            return null;
        }
        System.out.print("Enter your full Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your Address : ");
        String address = scanner.nextLine();
        System.out.print("Enter your Phone Number : ");
        String phoneNumber = scanner.nextLine();
        return new Member(id,name,address,phoneNumber);
    }

    static boolean isIdExists(String id){
        for(Patient patient : patients){
            if(patient.getId().equals(id)){
                return true;
            }
        }

        for(Physician physician : physicians){
            if(physician.getId().equals(id)){
                return true;
            }
        }

        return false;
    }

    static ArrayList<Physician> displayByExpertise(String exp) {
        ArrayList<Physician> physicianArrayList = new ArrayList<>();
        for (Physician physician : physicians) {
            Util util = physician.getUtil();
            ArrayList<String> expertise = util.getExpertise();
            for (String s : expertise) {
                if (s.contains(exp)) {
                    physicianArrayList.add(physician);
                }
            }
        }
        return physicianArrayList;
    }

    static Physician displayByName(String name) {
        for (Physician physician : physicians) {
            if (physician.getFullName().contains(name)) {
                return physician;
            }
        }
        return new Physician("", "", "", "", null);
    }

    static boolean differenceDate(Date obj1, Date obj2) {
        Duration duration = Duration.between(obj1.toInstant(), obj2.toInstant());
        if (duration.toMinutes() <= 30) {
            return false;
        } else {
            return true;
        }
    }

    static boolean isValidDate(String s1, String s2) {
        if (s1.contains(s2)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isValidDay(ArrayList<String> days, String s2) {
        for (String s1 : days) {
            String day = String.valueOf(s1.charAt(0)) + String.valueOf(s1.charAt(1)) + String.valueOf(s1.charAt(2));
            if (day.equals(s2)) {
                return true;
            }
        }
        return false;
    }

    static Physician getPhysician(String id) {
        for (Physician physician : physicians) {
            if (physician.getId().equals(id)) {
                return physician;
            }
        }
        return new Physician("", "", "", "", null);
    }

    static void settingMissedOnes(){
        for(Appointment appointments : treatmentAppointments){
            Date date = new Date();
            Date appointmentTime = appointments.getAppointmentTime();
            if(date.after(appointmentTime)){
                appointments.setResult(Result.MISSED);
            }
        }
    }

}
