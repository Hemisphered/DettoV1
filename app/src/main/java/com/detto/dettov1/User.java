package com.detto.dettov1;

import android.net.Uri;

/**
 * Created by welcome on 3/23/2017.
 */

public class User {
    public String email;
    public String name;
    public String dpurl;
    public String dob;
    public String gender;
    public User(){

    }
    public User(String dpurl, String dob, String gender, String email, String name) {
        this.dpurl = dpurl;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpurl() {
        return dpurl;
    }

    public void setDpurl(String dpurl) {
        this.dpurl = dpurl;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

