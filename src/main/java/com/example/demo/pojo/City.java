package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class City {
    private int id;
    private String bname;
    private int prov_id;
    private Province province;

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", prov_id=" + prov_id +
                ", province=" + province +
                '}';
    }
}
