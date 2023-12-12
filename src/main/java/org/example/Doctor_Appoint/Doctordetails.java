package org.example.Doctor_Appoint;

public class Doctordetails {
    private String DoctorId;
    private String DoctorName;
    private String DoctorSpeciality;
    private String Date;
    private String Time;

    public Doctordetails(String doctorId, String doctorName, String doctorSpeciality, String date, String time) {
        DoctorId = doctorId;
        DoctorName = doctorName;
        DoctorSpeciality = doctorSpeciality;
        Date = date;
        Time = time;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String doctorId) {
        DoctorId = doctorId;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDoctorSpeciality() {
        return DoctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        DoctorSpeciality = doctorSpeciality;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "Doctordetails{" +
                "DoctorId='" + DoctorId + '\'' +
                ", DoctorName='" + DoctorName + '\'' +
                ", DoctorSpeciality='" + DoctorSpeciality + '\'' +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }
}