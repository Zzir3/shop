package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component

public class Customer {

    private int id;

    private String username;//账号 必填

    private String realname;//可空

    private String intro;//可空

    private String imgUrl;//头像 可空 有默认值

    private String pass;//密码 必填

    private char gender;//性别 可空 有默认值

    private String tel;//电话 必填

    private String email;//邮箱 必填

    private String cardID;//身份证 可空

    private String regTime;//注册时间 可空 有默认值

    private String state;//账户状态 可空 有默认值

    private String level;//客户级别 可空 有默认值


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", intro='" + intro + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", pass='" + pass + '\'' +
                ", gender=" + gender +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", cardID='" + cardID + '\'' +
                ", regTime='" + regTime + '\'' +
                ", state='" + state + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
