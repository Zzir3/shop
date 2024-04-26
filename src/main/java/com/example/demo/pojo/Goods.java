package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Goods {
    private int id;
    private String keywords;
    private String code;
    private String spec;
    private double in_price;
    private double out_price;
    private int stock;
    private String imgUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public double getIn_price() {
        return in_price;
    }

    public void setIn_price(double in_price) {
        this.in_price = in_price;
    }

    public double getOut_price() {
        return out_price;
    }

    public void setOut_price(double out_price) {
        this.out_price = out_price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", keywords='" + keywords + '\'' +
                ", code='" + code + '\'' +
                ", spec='" + spec + '\'' +
                ", in_price=" + in_price +
                ", out_price=" + out_price +
                ", stock=" + stock +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

}
