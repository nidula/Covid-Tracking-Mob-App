package com.example.qrreader.data.model;

public class Citizen {
    private final int Id;
    private final String Name;
    private final int Age;
    private final String NIC;
    private final String Address;
    private final String Proffession;
    private final String Email;
    private final String Affiliation;
    private final String Password;
    private final int HealthStatus;
    private final Double Latitude;
    private final Double Longtitude;

    public Citizen(int id, String name, int age, String nic, String address, String proffession, String email, String affiliation, String password, int healthStatus, Double latitude, Double longtitude){
        Id = id;
        this.Name = name;
        Age = age;
        this.NIC = nic;
        this.Address = address;
        this.Proffession = proffession;
        this.Email = email;
        this.Affiliation = affiliation;
        this.Password = password;
        HealthStatus = healthStatus;
        this.Latitude = latitude;
        this.Longtitude = longtitude;
    }

    public int getId(){return Id;}
    public String getName(){return Name;}
    public int getAge(){return Age;}
    public String getNIC(){return NIC;}
    public String getAddress(){return Address;}
    public String getProffession(){return Proffession;}
    public String getEmail(){return Email;}
    public String getAffiliation(){return Affiliation;}
    public String getPassword(){return Password;}
    public Double getLatitude(){return Latitude;}
    public Double getLongtitude(){return Longtitude;}
}
