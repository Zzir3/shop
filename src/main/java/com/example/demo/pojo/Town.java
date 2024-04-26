package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Town {
    private int id;
    private String tname;
    private int region_id;
    private Region region;

    @Override
    public String toString() {
        return "Town{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", region_id=" + region_id +
                ", region=" + region +
                '}';
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

}
