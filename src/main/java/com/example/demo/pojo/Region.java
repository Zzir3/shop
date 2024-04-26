package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Region {
    private int id;
    private String fname;
    private int city_id;
    private City city;

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", city_id=" + city_id +
                ", city=" + city +
                '}';
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

}
