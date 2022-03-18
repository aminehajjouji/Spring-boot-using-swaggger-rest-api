package com.sqli.example.models;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private String name ;
    private String mail;
    private String tele;

    public Student() {
    }

    public Student(int id, String name, String mail, String tele) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.tele = tele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", tele=" + tele +
                '}';
    }
}
