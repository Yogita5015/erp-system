package com.example.shivam.erpsystem.Model;

public class CustomerModel
{
    private int id;
    private String Name;
    private  int Email;
    private int MobileNo;
    private  String Address;
    private int GSTno;
    private int PANCardNo;

    public int getEmail() {
        return Email;
    }

    public void setEmail(int email) {
        Email = email;
    }



    public CustomerModel(int email) {
        Email = email;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(int mobileNo) {
        MobileNo = mobileNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getGSTno() {
        return GSTno;
    }

    public void setGSTno(int GSTno) {
        this.GSTno = GSTno;
    }

    public int getPANCardNo() {
        return PANCardNo;
    }

    public void setPANCardNo(int PANCardNo) {
        this.PANCardNo = PANCardNo;
    }

    public CustomerModel(int id, String name, int mobileNo, String address, int GSTno, int PANCardNo) {
        this.id = id;
        Name = name;
        MobileNo = mobileNo;
        Address = address;
        this.GSTno = GSTno;
        this.PANCardNo = PANCardNo;
    }


    }
