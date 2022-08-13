package com.example.se306project1.models;

public class Category2 extends Category{
    private String layout;

    public Category2(){

    }

    public Category2(String layout) {
        this.layout = layout;
    }

    public Category2(String title, int image, String layout) {
        super(title, image);
        this.layout = layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
    public String getLayout() {return layout;}
}
