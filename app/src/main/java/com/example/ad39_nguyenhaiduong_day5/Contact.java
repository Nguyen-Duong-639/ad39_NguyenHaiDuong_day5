package com.example.ad39_nguyenhaiduong_day5;

import java.util.Calendar;
import java.util.Date;

public class Contact {
    private String phoneNumber;
    public static Date time = null;

    public Contact(String phoneNumber, Date time) {
        this.phoneNumber = phoneNumber;
        this.time = time;
    }
    public Contact(Calendar time) {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
