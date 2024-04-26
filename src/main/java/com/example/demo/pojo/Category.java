package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Category {


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public char getIsShow() {
        return isShow;
    }

    public void setIsShow(char isShow) {
        this.isShow = isShow;
    }

    private String code;
    private String aname;
    private Integer pid;
    private char isShow;
    private Integer id;

    @Override
    public String toString() {
        return "Category{" +
                "code='" + code + '\'' +
                ", aname='" + aname + '\'' +
                ", pid=" + pid +
                ", isShow=" + isShow +
                ", id=" + id +
                '}';
    }
}
