package com.maugarciaf.employeemeeting.model;

public class EmployeeTimeClass {

    private String time;
    private String employee1;
    private String employee2;
    private String employee3;
    private String employee4;
    private String employee5;
    private String employee6;

    public EmployeeTimeClass(){

    }

    public EmployeeTimeClass(String time, String employee1, String employee2, String employee3, String employee4, String employee5, String employee6) {
        this.time = time;
        this.employee1 = employee1;
        this.employee2 = employee2;
        this.employee3 = employee3;
        this.employee4 = employee4;
        this.employee5 = employee5;
        this.employee6 = employee6;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmployee1() {
        return employee1;
    }

    public void setEmployee1(String employee1) {
        this.employee1 = employee1;
    }

    public String getEmployee2() {
        return employee2;
    }

    public void setEmployee2(String employee2) {
        this.employee2 = employee2;
    }

    public String getEmployee3() {
        return employee3;
    }

    public void setEmployee3(String employee3) {
        this.employee3 = employee3;
    }

    public String getEmployee4() {
        return employee4;
    }

    public void setEmployee4(String employee4) {
        this.employee4 = employee4;
    }

    public String getEmployee5() {
        return employee5;
    }

    public void setEmployee5(String employee5) {
        this.employee5 = employee5;
    }

    public String getEmployee6() {
        return employee6;
    }

    public void setEmployee6(String employee6) {
        this.employee6 = employee6;
    }
}
