package com.maugarciaf.employeemeeting.ui.dashboard;

public class Meetings {
    private String nameEmploye;
    private String meetingHours;

    public Meetings() {
    }

    public Meetings(String nameEmploye, String meetingHours) {
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
