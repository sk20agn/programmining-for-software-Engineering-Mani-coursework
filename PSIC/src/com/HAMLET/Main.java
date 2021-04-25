package com.HAMLET;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static ArrayList<String> expertise = new ArrayList<>();
    static ArrayList<String> days = new ArrayList<>();
    static ArrayList<Physician> physicians = new ArrayList<>();
    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<ConsultationAppointment> consultationAppointments = new ArrayList<>();
    static ArrayList<Appointment> treatmentAppointments = new ArrayList<>();
    static Patient user = null;

    static Scanner scanner = new Scanner(System.in);
    static String[] daysOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};


    public static void main(String[] args) {
        settingData();
        menu();
    }

    private static void settingData() {
        expertise.add("Consultant Physician");
        expertise.add("Internal Medicine Specialist");
        expertise.add("Hepatologist");
        expertise.add("Gastroenterologist");
        expertise.add("Family Physician");
        days.add("Tuesday");
        days.add("Wednesday");
        Util util = new Util(days, LocalTime.parse("10:00:00"), "Medical Consulting room A", "2 hours on Monday Afternoon", expertise);
        Physician physician1 = new Physician("id1", "Assoc. Prof. Dr. Liam", "123 Street, Block A XYZ Town", "+04238900939", util);
        physicians.add(physician1);
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("27/04/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Appointment a = new Appointment(physician1.getFullName(), "Family Physician", "James", date, "Medical Consulting room A", Result.BOOKED, "Tue Apr 27 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("04/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician1.getFullName(), "Family Physician", "Benjamin", date, "Medical Consulting room A", Result.BOOKED, "Tue Mar 04 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician1.getFullName(), "Family Physician", "Lucas", date, "Medical Consulting room A", Result.BOOKED, "Tue Mar 11 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician1.getFullName(), "Family Physician", "Mason", date, "Medical Consulting room A", Result.BOOKED, "Tue Mar 18 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);


        expertise = new ArrayList<>();
        days = new ArrayList<>();
        expertise.add("Consultant Physician");
        expertise.add("General Physician");
        expertise.add("Internal Medicine Specialist");
        expertise.add("Family Physician");
        days.add("Tuesday");
        days.add("Thursday");
        util = new Util(days, LocalTime.parse("10:00:00"), "Medical Consulting room B", "2 hours on Wednesday Afternoon", expertise);
        Physician physician2 = new Physician("id2", "Dr. Noah", "ABC city xyz", "+9200000000", util);
        physicians.add(physician2);

        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("29/04/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician2.getFullName(), "Family Physician", "Ethan", date, "Medical Consulting room B", Result.BOOKED, "Tue Apr 29 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("06/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician2.getFullName(), "Family Physician", "Alexander", date, "Medical Consulting room B", Result.BOOKED, "Tue Mar 06 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("13/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician2.getFullName(), "Family Physician", "Henry", date, "Medical Consulting room B", Result.BOOKED, "Tue Mar 13 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician2.getFullName(), "Family Physician", "Henry", date, "Medical Consulting room B", Result.BOOKED, "Tue Mar 20 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);


        expertise = new ArrayList<>();
        days = new ArrayList<>();
        expertise.add("Consultant Physician");
        expertise.add("Internal Medicine Specialist");
        days.add("Monday");
        days.add("Wednesday");
        util = new Util(days, LocalTime.parse("10:00:00"), "Medical Consulting room C", "2 hours on Tuesday Afternoon", expertise);
        Physician physician3 = new Physician("id3", "Dr. Oliver", " XYZ Street", "+92111111", util);
        physicians.add(physician3);

        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("28/04/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician3.getFullName(), "Family Physician", "Michael", date, "Medical Consulting room C", Result.BOOKED, "Tue Apr 28 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician3.getFullName(), "Family Physician", "Daniel", date, "Medical Consulting room C", Result.BOOKED, "Tue Mar 05 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician3.getFullName(), "Family Physician", "Daniel", date, "Medical Consulting room C", Result.BOOKED, "Tue Mar 12 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("29/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician3.getFullName(), "Family Physician", "Jackson", date, "Medical Consulting room C", Result.BOOKED, "Tue Mar 19 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);


        expertise = new ArrayList<>();
        days = new ArrayList<>();
        expertise.add("Consultant Physician");
        expertise.add("General Physician");
        expertise.add("Internal Medicine Specialist");
        expertise.add("Pool Rehabilitation");
        days.add("Wednesday");
        days.add("Saturday");
        util = new Util(days, LocalTime.parse("10:00:00"), "Pool", "2 hours on Thursday Afternoon", expertise);
        Physician physician4 = new Physician("id4", "Dr. William", "St Town", "+92333333", util);
        physicians.add(physician4);

        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("24/04/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician4.getFullName(), "Pool Rehabilitation", "Aiden", date, "Pool", Result.BOOKED, "Tue Apr 24 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician4.getFullName(), "Pool Rehabilitation", "Huzaif", date, "Pool", Result.BOOKED, "Tue Mar 01 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("08/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician4.getFullName(), "Pool Rehabilitation", "Isaac", date, "Pool", Result.BOOKED, "Tue Mar 08 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2021 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        a = new Appointment(physician4.getFullName(), "Pool Rehabilitation", "Lucas", date, "Pool", Result.BOOKED, "Tue Mar 15 10:00:00 PKT 2021 , 10 to 12");
        treatmentAppointments.add(a);


        expertise = new ArrayList<>();
        days = new ArrayList<>();
        expertise.add("Consultant Physician");
        expertise.add("General Physician");
        expertise.add("Massage");
        days.add("Tuesday");
        days.add("Thursday");
        util = new Util(days, LocalTime.parse("10:00:00"), "Gym", "2 hours on Saturday Afternoon", expertise);
        Physician physician5 = new Physician("id5", "Dr. Elijah", "CH heart Complex", "+92444444", util);
        physicians.add(physician5);

        Patient patient1 = new Patient("1", "James", "abc1 street town xyz", "+9211111111", null);
        Patient patient2 = new Patient("2", "Benjamin", "abc2 street town xyz", "+9222222222", null);
        Patient patient3 = new Patient("3", "Lucas", "abc3 street town xyz", "+9233333333", null);
        Patient patient4 = new Patient("4", "Mason", "abc4 street town xyz", "+9244444444", null);
        Patient patient5 = new Patient("5", "Ethan", "abc5 town xyz", "+925555555", null);
        Patient patient6 = new Patient("6", "Alexander", "abc6 town xyz", "+9266666666", null);
        Patient patient7 = new Patient("7", "Henry", "aab7 town xyz ", "+9277777777", null);
        Patient patient8 = new Patient("8", "Henry", "abc8 town xyz", "+92888888888", null);
        Patient patient9 = new Patient("9", "Michael", "abc9 town xyz", "+929999999", null);
        Patient patient10 = new Patient("10", "Daniel", "abc town xyz", "+9211111100", null);
        Patient patient11 = new Patient("11", "Daniel", "abc123 town xyz", "+9222222200", null);
        Patient patient12 = new Patient("12", "Jackson", "abc1234 town xyz", "+9233333300", null);
        Patient patient13 = new Patient("13", "Aiden", "abc12345 town xyz", "+9244444400", null);
        Patient patient14 = new Patient("14", "Wyatt", "abc12 city xyz", "+925555500", null);
        Patient patient15 = new Patient("15", "Isaac", "abc1236 town xyz", "+9266666600", null);
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        patients.add(patient6);
        patients.add(patient7);
        patients.add(patient8);
        patients.add(patient9);
        patients.add(patient10);
        patients.add(patient11);
        patients.add(patient12);
        patients.add(patient13);
        patients.add(patient14);
        patients.add(patient15);

        try {
            date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse("24/04/2021 01:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ConsultationAppointment consultationAppointment = new ConsultationAppointment(physician1.getFullName(), "Sebastian", date);
        consultationAppointments.add(consultationAppointment);

        try {
            date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse("24/04/2021 01:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        consultationAppointment = new ConsultationAppointment(physician1.getFullName(), "Matthew", date);
        consultationAppointments.add(consultationAppointment);

        try {
            date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse("24/04/2021 01:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        consultationAppointment = new ConsultationAppointment(physician1.getFullName(), "Samuel", date);
        consultationAppointments.add(consultationAppointment);

        try {
            date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse("24/04/2021 01:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        consultationAppointment = new ConsultationAppointment(physician1.getFullName(), "Levi", date);
        consultationAppointments.add(consultationAppointment);

    }

    private static void menu() {
        while (true) {
            System.out.println("\n");
            System.out.println("Welcome to the System");

            System.out.println("1. Add Patient");
            System.out.println("2. Register Physicians");
            System.out.println("3. Display Available Treatments");
            System.out.println("4. Display Available Physicians");
            System.out.println("5. Consultation Appointment");
            System.out.println("6. Treatment Appointment");
            System.out.println("7. Report of Appointment");
            System.out.println("8. Exit");

            System.out.print("Enter value : ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    Member memberPatient = EXTRA.getMember();
                    if (Objects.isNull(memberPatient)) {
                        System.out.println("Id should be unique");
                        break;
                    } else {
                        Patient patient = new Patient(memberPatient.getId(), memberPatient.getFullName(), memberPatient.getAddress(), memberPatient.getTelephoneNumber(), null);
                        patients.add(patient);
                        System.out.println("Patient registered successfully");
                    }
                    break;
                case 2:
                    Member member = EXTRA.getMember();
                    if (Objects.isNull(member)) {
                        System.out.println("Id should be unique");
                        break;
                    } else {
                        Util util = EXTRA.getUtil();
                        Physician physician = new Physician(member.getId(), member.getFullName(), member.getAddress(), member.getTelephoneNumber(), util);
                        physicians.add(physician);
                        System.out.println("Physician registered successfully");
                    }
                    break;

                case 3:
                    System.out.println("\n");
                    ArrayList<String> ex = new ArrayList<>();
                    for (Physician physician : physicians) {
                        Util util = physician.getUtil();
                        ArrayList<String> expertise = util.getExpertise();
                        for (String s : expertise) {
                            if (!ex.contains(s)) {
                                ex.add(s);
                            }
                        }
                    }
                    for (String s : ex) {
                        System.out.println(s);
                    }

                    break;
                case 4:
                    System.out.println("\n\n");
                    for (Physician physician : physicians) {
                        System.out.println(physician.getFullName());
                    }
                    break;
                case 5:
                    System.out.println("\n1. Search by Expertise");
                    System.out.println("2. Search by Name");
                    System.out.println("3. Show All");

                    System.out.print("Enter value : ");
                    int i = scanner.nextInt();

                    if (i == 1) {
                        System.out.print("Enter Expertise of Physician : ");
                        scanner.next();
                        String exp = scanner.nextLine();
                        ArrayList<Physician> physicians = EXTRA.displayByExpertise(exp);
                        if (physicians.isEmpty()) {
                            System.out.println("empty");
                            return;
                        } else {
                            System.out.println(physicians);
                            System.out.println("Enter id of your selected physician");
                            scanner.next();
                            String phydId = scanner.nextLine();
                            if (phydId.isEmpty()) {
                                System.out.println("We could not found any record. Enter valid physician Id");
                                break;
                            } else {
                                Physician physician = EXTRA.getPhysician(phydId);
                                if (physician.getFullName().isEmpty()) {
                                    System.out.println("We could not found any record. Enter valid physician Id");
                                    break;
                                } else {
                                    setConsultationAppointment(physician);
                                    break;
                                }
                            }
                        }
                    } else if (i == 2) {
                        System.out.print("Enter Name of Physician : ");
                        scanner.next();
                        String name = scanner.nextLine();
                        Physician physician = EXTRA.displayByName(name);
                        if (physician.getFullName().toString().isEmpty()) {
                            System.out.println("We could not found any record");
                            break;
                        } else {
                            System.out.println(physician);
                            setConsultationAppointment(physician);
                            break;
                        }
                    } else if (i == 3) {
                        for (Physician physician : physicians) {
                            System.out.println(physician.toString() + "\n");
                        }
                        System.out.println("Enter id of your selected physician");
                        String phydId = scanner.next();
                        if (phydId.isEmpty()) {
                            System.out.println("We could not found any record. Enter valid physician Id");
                            break;
                        } else {
                            Physician physician = EXTRA.getPhysician(phydId);
                            if (physician.getFullName().isEmpty()) {
                                System.out.println("We could not found any record. Enter valid physician Id");
                                break;
                            } else {
                                setConsultationAppointment(physician);
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                case 6:
                    EXTRA.settingMissedOnes();
                    if (!Objects.isNull(user)) {
                        System.out.println("\n1. Search by Expertise");
                        System.out.println("2. Search by Name");
                        System.out.println("3. Show All");
                        System.out.println("4. Edit Appointment");
                        System.out.println("5. Attend Appointment");

                        System.out.print("Enter value : ");
                        i = scanner.nextInt();

                        if (i == 1) {
                            System.out.print("Enter Expertise of Physician : ");
                            scanner.next();
                            String exp = scanner.nextLine();
                            ArrayList<Physician> physicians = EXTRA.displayByExpertise(exp);
                            if (physicians.isEmpty()) {
                                System.out.println("empty");
                                return;
                            } else {
                                System.out.println(physicians);
                                System.out.println("Enter id of your selected physician");
                                String phydId = scanner.next();
                                if (phydId.isEmpty()) {
                                    System.out.println("We could not found any record. Enter valid physician Id");
                                    break;
                                } else {
                                    Physician physician = EXTRA.getPhysician(phydId);
                                    if (physician.getFullName().isEmpty()) {
                                        System.out.println("We could not found any record. Enter valid physician Id");
                                        break;
                                    } else {
                                        setTreatmentAppointment(physician, user);
                                        break;
                                    }
                                }
                            }
                        } else if (i == 2) {
                            System.out.print("Enter Name of Physician : ");
                            scanner.next();
                            String name = scanner.nextLine();
                            Physician physician = EXTRA.displayByName(name);
                            if (physician.getFullName().toString().isEmpty()) {
                                System.out.println("We could not found any record");
                                break;
                            } else {
                                System.out.println(physician);
                                setTreatmentAppointment(physician, user);
                                break;
                            }
                        } else if (i == 3) {
                            for (Physician physician : physicians) {
                                System.out.println(physician.toString() + "\n");
                            }

                            System.out.println("Enter id of your selected physician");
                            String phydId = scanner.next();
                            if (phydId.isEmpty()) {
                                System.out.println("We could not found any record. Enter valid physician Id");
                                break;
                            } else {
                                Physician physician = EXTRA.getPhysician(phydId);
                                if (physician.getFullName().isEmpty()) {
                                    System.out.println("We could not found any record. Enter valid physician Id");
                                    break;
                                } else {
                                    setTreatmentAppointment(physician, user);
                                    break;
                                }
                            }
                        } else if (i == 4) {

                            for (int c = 0; c < treatmentAppointments.size(); c++) {
                                Appointment appointment = treatmentAppointments.get(c);

                                if (appointment.getPatientName().equals(user.getFullName()) && appointment.getResult().equals(Result.BOOKED)) {
                                    System.out.println(c + " -> " + appointment);
                                }
                            }

                            System.out.print("Enter index of appointment : ");
                            int index = scanner.nextInt();
                            Appointment cancelled = treatmentAppointments.get(index);
                            cancelled.setResult(Result.CANCELLED);
                            System.out.println("Appointment Cancelled");
                            System.out.println("You can add a new appointment");
                            System.out.println(treatmentAppointments);
                            break;
                        } else if (i == 5) {
                            for (int c = 0; c < treatmentAppointments.size(); c++) {
                                Appointment appointment = treatmentAppointments.get(c);

                                if (appointment.getPatientName().equals(user.getFullName()) && appointment.getResult().equals(Result.BOOKED)) {
                                    System.out.println(c + " -> " + appointment);
                                }
                            }

                            System.out.print("Enter index of appointment : ");
                            int index = scanner.nextInt();
                            Appointment attend = treatmentAppointments.get(index);
                            Date date = new Date();
                            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                            String datee = formatter.format(date);

                            if (attend.getDetailedTime().contains(datee) && EXTRA.differenceDate(attend.getAppointmentTime(), date)) {
                                attend.setResult(Result.ATTENDED);
                                System.out.println("Appointment Attended");
                            } else {
                                System.out.println(attend.getAppointmentTime());
                                System.out.println(date);
                                System.out.println("You cannot attend meeting at this time");
                            }
                            break;
                        } else {
                            break;
                        }

                    } else {
                        System.out.print("Enter patient Id : ");
                        String userId = scanner.next();

                        for (Patient patient : patients) {
                            if (patient.getId().equals(userId)) {
                                System.out.println("Logged in to the system");
                                user = patient;
                                break;
                            }
                        }

                        if (Objects.isNull(user)) {
                            System.out.println("Enter valid ID");
                        }
                    }
                    break;
                case 7:
                    System.out.println("\n\n");
                    System.out.println("Treatments Appointments");
                    for (Appointment appointment : treatmentAppointments) {
                        System.out.println(appointment);
                    }

                    System.out.println("\n\nConsultation Appointments");
                    for (ConsultationAppointment appointment : consultationAppointments) {
                        System.out.println(appointment);
                    }

                    break;
                case 8:
                    return;
                default:
                    System.out.println("Enter valid number");
            }
        }
    }

    private static void setConsultationAppointment(Physician physician) {
        String name = physician.getFullName();
        Util util = physician.getUtil();
        System.out.print("Enter your name : ");
        scanner.next();
        String visitorName = scanner.nextLine();
        System.out.print("Enter your appointment date (Date should be of format '30/12/2000' ) : ");
        String inputDate = scanner.nextLine();

        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(inputDate + " 01:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (consultationAppointments.isEmpty()) {
            if (EXTRA.isValidDate(util.getConsultaionTime(), daysOfWeek[date.getDay() - 1])) {
                ConsultationAppointment appointment = new ConsultationAppointment(name, visitorName, date);
                consultationAppointments.add(appointment);
                System.out.println("Your appointment has been fixed. Try to be there in time");
            } else {
                System.out.println("You cannot book appointment of this date. Try another one");
            }
        } else {

            for (ConsultationAppointment consultationAppointment : consultationAppointments) {
                if (consultationAppointment.getPhysicianName().equals(name)
                        && !EXTRA.isValidDate(util.getConsultaionTime(), daysOfWeek[date.getDay() - 1])) {
                    System.out.println("You cannot book appointment of this date. Try another one");
                    return;
                }
            }

            ConsultationAppointment appointment = new ConsultationAppointment(name, visitorName, date);
            consultationAppointments.add(appointment);
            System.out.println("Your appointment has been fixed. Try to be there in time.");
        }

    }

    private static void setTreatmentAppointment(Physician physician, Patient user) {
        String name = physician.getFullName();
        Util util = physician.getUtil();

        System.out.print("Enter treatment name : ");
        scanner.next();
        String treatmentName = scanner.nextLine();
        System.out.print("Enter your appointment date (Date should be of format '30/12/2000' ) : ");
        String inputDate = scanner.nextLine();

        int counter = 0;
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").parse(inputDate + " " + EXTRA.getHour(EXTRA.getTimeSpan(counter)) + ":00:00");
            counter = getAppointmentsOfDay(date, util.getRoomId());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int index = date.getDay() - 1;
        if (index != -1) {
            System.out.println(index);
            String day = daysOfWeek[index];
            System.out.println(day);
            if (treatmentAppointments.isEmpty()) {
                System.out.println("empty");
                if (EXTRA.isValidDay(util.getDays(), day)) {
                    String finalDateTime = date + " , " + EXTRA.getTimeSpan(getAppointmentsOfDay(date, util.getRoomId()));
                    Appointment appointment = new Appointment(name, treatmentName, user.getFullName(), date, util.getRoomId(), Result.BOOKED, finalDateTime);
                    treatmentAppointments.add(appointment);
                    System.out.println("Your appointment has been fixed. Try to be there in time");
                } else {
                    System.out.println("You cannot book appointment of this date. Try another one");
                }
            } else {
                for (Appointment appointment : treatmentAppointments) {
                    if (!EXTRA.isValidDay(util.getDays(), day)) {
                        System.out.println("You cannot book appointment of this date. Try another one");
                        return;
                    }
                }

                if (counter < 3) {
                    String finalDateTime = date + " , " + EXTRA.getTimeSpan(getAppointmentsOfDay(date, util.getRoomId()));
                    Appointment newAppointment = new Appointment(name, treatmentName, user.getFullName(), date, util.getRoomId(), Result.BOOKED, finalDateTime);
                    treatmentAppointments.add(newAppointment);
                    System.out.println("Your appointment has been fixed. Try to be there in time");
                } else {
                    System.out.println("You cannot book appointment of this date. Try another one");
                }
            }
        } else {
            System.out.println("You cannot book appointment of this date. Try another one");
        }

    }

    private static int getAppointmentsOfDay(Date date, String roomId) {
        int counter = 0;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String strDate = dateFormat.format(date);

        for (Appointment appointment : treatmentAppointments) {
            String d = dateFormat.format(appointment.getAppointmentTime());
            if (roomId.equals(appointment.getRoom()) && strDate.equals(d)) {
                counter++;
            }
        }
        return counter;
    }
}
