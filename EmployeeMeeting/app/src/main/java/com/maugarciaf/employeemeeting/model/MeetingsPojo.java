package com.maugarciaf.employeemeeting.model;

public class MeetingsPojo {
    private String nameEmploye;
    private String meetingHours;

    public MeetingsPojo() {
    }

    public MeetingsPojo(String nameEmploye, String meetingHours) {
        this.nameEmploye = nameEmploye;
        this.meetingHours = meetingHours;
    }

    public String getNameEmploye() {
        return nameEmploye;
    }

    public void setNameEmploye(String nameEmploye) {
        this.nameEmploye = nameEmploye;
    }

    public String getMeetingHours() {
        return meetingHours;
    }

    public void setMeetingHours(String meetingHours) {
        this.meetingHours = meetingHours;
    }
}
