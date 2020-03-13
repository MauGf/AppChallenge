package com.maugarciaf.employeemeeting.model;

/*import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;*/

public class MeetingsClass {

    private String name;
    private String meeting1;
    private String meeting2;
    private String meeting3;
    private String meeting4;
    private String meeting5;

    public MeetingsClass() {
    }

    public MeetingsClass(String name, String meeting1, String meeting2, String meeting3, String meeting4, String meeting5) {
        this.name = name;
        this.meeting1 = meeting1;
        this.meeting2 = meeting2;
        this.meeting3 = meeting3;
        this.meeting4 = meeting4;
        this.meeting5 = meeting5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeeting1() {
        return meeting1;
    }

    public void setMeeting1(String meeting1) {
        this.meeting1 = meeting1;
    }

    public String getMeeting2() {
        return meeting2;
    }

    public void setMeeting2(String meeting2) {
        this.meeting2 = meeting2;
    }

    public String getMeeting3() {
        return meeting3;
    }

    public void setMeeting3(String meeting3) {
        this.meeting3 = meeting3;
    }

    public String getMeeting4() {
        return meeting4;
    }

    public void setMeeting4(String meeting4) {
        this.meeting4 = meeting4;
    }

    public String getMeeting5() {
        return meeting5;
    }

    public void setMeeting5(String meeting5) {
        this.meeting5 = meeting5;
    }
}


/*



public class MeetingsPojo {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("meeting1")
    @Expose
    private String meeting1;
    @SerializedName("meeting2")
    @Expose
    private String meeting2;
    @SerializedName("meeting3")
    @Expose
    private String meeting3;
    @SerializedName("meeting4")
    @Expose
    private String meeting4;
    @SerializedName("meeting5")
    @Expose
    private String meeting5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeeting1() {
        return meeting1;
    }

    public void setMeeting1(String meeting1) {
        this.meeting1 = meeting1;
    }

    public String getMeeting2() {
        return meeting2;
    }

*/
