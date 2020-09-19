package com.example.bdbuddy;

public class User {
    String name,username,email,age,rate,languages,areas,about,profes,address,experiance;

    public User() {
    }

    public User(String name,String username, String email, String age, String rate, String languages, String areas, String about, String profes, String address, String experiance) {
        this.name = name;
        this.username=username;
        this.email = email;
        this.age = age;
        this.rate = rate;
        this.languages = languages;
        this.areas = areas;
        this.about = about;
        this.profes = profes;
        this.address = address;
        this.experiance = experiance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getProfes() {
        return profes;
    }

    public void setProfes(String profes) {
        this.profes = profes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }
}
