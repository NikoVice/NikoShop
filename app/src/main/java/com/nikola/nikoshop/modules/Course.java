package com.nikola.nikoshop.modules;

public class Course {
    int id;
    String img, title, date, lavel, color;

    public Course(int id, String img, String title, String date, String lavel, String color) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.date = date;
        this.lavel = lavel;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLavel() {
        return lavel;
    }

    public void setLavel(String lavel) {
        this.lavel = lavel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
