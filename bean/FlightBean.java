package com.example.airportmanage.bean;

import java.sql.Time;

public class FlightBean {
    private String Fid;      //航班号
    private String Fcom;     //航空公司
    private String Checkin;  //值机柜台

    public String getFid() {
        return Fid;
    }

    public String getFcom() {
        return Fcom;
    }

    public String getCheckin() {
        return Checkin;
    }

    public String getOrigi() {
        return Origi;
    }

    public String getBoardgate() {
        return Boardgate;
    }

    public String getDesti() {
        return Desti;
    }

    public Time getTOtime() {
        return TOtime;
    }

    public Time getLAtime() {
        return LAtime;
    }

    public Time getActtotime() {
        return Acttotime;
    }

    public Time getActlatime() {
        return Actlatime;
    }

    private String Origi;    //出发地
    private String Boardgate;//登机口
    private String Desti;    //目的地
    private Time TOtime;     //起飞时间
    private Time LAtime;     //降落时间
    private Time Acttotime;  //实际起飞时间
    private Time Actlatime;  //实际降落时间

}
