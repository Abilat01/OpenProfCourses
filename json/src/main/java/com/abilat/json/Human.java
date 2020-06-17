package com.abilat.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Human {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("orientation")
    @Expose
    private String orientation;
    @SerializedName("age")
    @Expose
    private int age;
    @SerializedName("books")
    @Expose
    private ArrayList<Human> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Human> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Human> books) {
        this.books = books;
    }

    public void getBooks(ArrayList books) {
    }
}
