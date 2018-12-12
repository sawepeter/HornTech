package com.example.devsawe.horntech.Model;

public class HomeModel {

    int background;
    String driverName;
    int profilePhoto;
    int btnfollow;
    int driverContact;

    public HomeModel() {
    }

    public HomeModel(int background, String driverName, int profilePhoto, int btnfollow, int driverContact) {
        this.background = background;
        this.driverName = driverName;
        this.profilePhoto = profilePhoto;
        this.btnfollow = btnfollow;
        this.driverContact = driverContact;
    }

    public int getBackground() {
        return background;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public int getBtnfollow() {
        return btnfollow;
    }

    public int getDriverContact() {
        return driverContact;
    }
}