package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int id;
    private int province_id;
    private int city_id;
    private int region_id;
    private String detail;
    private int town_id;
    private int street_id;
    private char postcode;
    private int customer_id;
    private char isDefault;
    private City city;
    private Customer customer;
    private Province province;
    private Region region;
    private Street street;
    private Town town;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province_id=" + province_id +
                ", city_id=" + city_id +
                ", region_id=" + region_id +
                ", detail='" + detail + '\'' +
                ", city=" + city +
                ", customer=" + customer +
                ", province=" + province +
                ", region=" + region +
                ", street=" + street +
                ", town=" + town +
                ", town_id=" + town_id +
                ", street_id=" + street_id +
                ", postcode=" + postcode +
                ", customer_id=" + customer_id +
                ", isDefault=" + isDefault +
                '}';
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
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

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        if (detail == null) { // 如果detail为null，则为其赋一个默认值
            this.detail = "";
        } else {
            this.detail = detail;
        }
    }

    public int getTown_id() {
        return town_id;
    }

    public void setTown_id(int town_id) {
        this.town_id = town_id;
    }

    public int getStreet_id() {
        return street_id;
    }

    public void setStreet_id(int street_id) {
        this.street_id = street_id;
    }

    public char getPostcode() {
        return postcode;
    }

    public void setPostcode(char postcode) {
        this.postcode = postcode;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public char getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(char isDefault) {
        this.isDefault = isDefault;
    }


}
