package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Province {
    private int id;
    private String  ename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                '}';
    }
}
