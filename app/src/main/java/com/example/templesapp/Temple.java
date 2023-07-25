package com.example.templesapp;

public class Temple {
    private int imgRes;
    private String TempleName;
    Temple(String templeName,int imgRes){
        this.TempleName=templeName;
        this.imgRes=imgRes;
    }

    public String getTempleName() {
        return TempleName;
    }

    public int getImgRes() {
        return imgRes;
    }
}
