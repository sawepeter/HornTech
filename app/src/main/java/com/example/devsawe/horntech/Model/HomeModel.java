package com.example.devsawe.horntech.Model;

public class HomeModel {

    private int image;
    private String name, route, book;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public HomeModel(int image, String name, String route, String book) {
        this.image = image;
        this.name = name;
        this.route = route;
        this.book = book;




    }
}