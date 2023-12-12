package org.example.Doctor_Appoint;

import org.example.Youtube.Channeldetails;

import java.util.HashMap;
import java.util.Scanner;

public class Doctor_appointApp {
    public static void main(String[] args) {
        HashMap<String, Doctordetails> d = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Doctor Appointment Application");
            System.out.println("1 Create new Appointment");
            System.out.println("2 view the Appointment");
            System.out.println("3 Exit");
            System.out.println("Enter your choice(1,2,3)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter DoctorID");
                    String DoctorId = scanner.nextLine();
                    System.out.println("Enter DoctorName");
                    String DoctorName = scanner.nextLine();
                    System.out.println("Enter Doctor Speciality");
                    String DoctorSpeciality = scanner.nextLine();
                    System.out.println("Enter Date");
                    String Date = scanner.nextLine();
                    System.out.println("Enter Time");
                    String Time = scanner.nextLine();

                    Doctordetails new_Appointment = new Doctordetails(DoctorId, DoctorName, DoctorSpeciality,Date,Time);
                    d.put(new_Appointment.getDoctorId(), new_Appointment);
                    System.out.println("Appointment created Successfully");
                    break;
                case 2:
                    System.out.println("Enter Doctor ID to Search");
                    String SearchKey = scanner.nextLine();
                    Doctordetails foundDoctor = d.get(SearchKey);
                    if (foundDoctor != null) {
                        System.out.println("Doctor details for the ID :" + SearchKey);
                        System.out.println("Doctor Name: " + foundDoctor.getDoctorName());
                        System.out.println("DoctorSpeciality" + foundDoctor.getDoctorSpeciality());
                        System.out.println("Date" + foundDoctor.getDate());
                        System.out.println("Time" + foundDoctor.getTime());


                    } else {
                        System.out.println("Appointment with name " + SearchKey + " not found");
                    }
                    break;
                case 3:
                    System.out.println("exisitng Doctor application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid channel - please select 1,2 or 3");
            }
        }
    }
}