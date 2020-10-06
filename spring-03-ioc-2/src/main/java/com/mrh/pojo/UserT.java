package com.mrh.pojo;

public class UserT {
    private String name;


    public UserT() {
        System.out.println("UserT的无参构造！！======UserT被创建了");
    }

    public UserT(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name"+name);
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}