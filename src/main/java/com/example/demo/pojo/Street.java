package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Street {
    private int id;
    private String sname;
    private int town_id;
    private Town town;

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", town_id=" + town_id +
                ", town=" + town +
                '}';
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getTown_id() {
        return town_id;
    }

    public void setTown_id(int town_id) {
        this.town_id = town_id;
    }

}
