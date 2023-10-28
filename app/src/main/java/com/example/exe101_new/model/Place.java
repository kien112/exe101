package com.example.exe101_new.model;

public class Place {
    private String name;
    private Integer img;
    private Integer price;

    public Place() {
    }

    public Place(String name, Integer img, Integer price) {
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
