package com.example.wy_interface;

public class User {
    private String name;
    private String  psd;

    public User(String name, String psd) {
        this.name = name;
        this.psd = psd;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", psd='" + psd + '\'' +
                '}';
    }
}
