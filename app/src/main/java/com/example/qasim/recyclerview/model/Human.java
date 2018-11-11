package com.example.qasim.recyclerview.model;

public class Human {
    private String name;
    private  int age;
    private  int icon;

    public Human(String name, int age, int icon) {
        this.name = name;
        this.age = age;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
