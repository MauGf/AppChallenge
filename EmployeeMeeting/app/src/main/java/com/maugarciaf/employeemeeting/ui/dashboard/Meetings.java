package com.maugarciaf.employeemeeting.ui.dashboard;

public class Meetings {
    private String nameEmploye;
    private int meetingHours;

    public Meetings() {
    }

    public Meetings(String nameEmploye, int meetingHours) {
        this.nameEmploye = nameEmploye;
        this.meetingHours = meetingHours;
    }

    public String getNameEmploye() {
        return nameEmploye;
    }

    public void setNameEmploye(String nameEmploye) {
        this.nameEmploye = nameEmploye;
    }

    public int getMeetingHours() {
        return meetingHours;
    }

    public void setMeetingHours(int meetingHours) {
        this.meetingHours = meetingHours;
    }
}
