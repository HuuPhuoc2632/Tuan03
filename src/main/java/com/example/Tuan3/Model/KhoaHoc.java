package com.example.Tuan3.Model;

import java.awt.*;

public class KhoaHoc {
    private String id;
    private String name;
    private String title;
    private double nativePrice;
    private double salePrice;

    private Image userImage;
    private String userName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getNativePrice() {
        return nativePrice;
    }

    public void setNativePrice(double nativePrice) {
        this.nativePrice = nativePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Image getUserImage() {
        return userImage;
    }

    public void setUserImage(Image userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhoaHoc(String id, String name, String title, double nativePrice, double salePrice, Image userImage, String userName) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.nativePrice = nativePrice;
        this.salePrice = salePrice;
        this.userImage = userImage;
        this.userName = userName;
    }

    public KhoaHoc() {
    }

    @Override
    public String toString() {
        return "KhoaHoc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", nativePrice=" + nativePrice +
                ", salePrice=" + salePrice +
                ", userImage=" + userImage +
                ", userName='" + userName + '\'' +
                '}';
    }
}
