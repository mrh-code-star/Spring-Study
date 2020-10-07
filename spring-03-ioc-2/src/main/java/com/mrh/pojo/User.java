package com.mrh.pojo;

public class User {
    private  String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User() {
        System.out.println("User被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {

        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}
