package com.mrh.pojo;

import com.sun.jmx.snmp.SnmpString;

public class UserT {
    private  String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public UserT() {
        System.out.println("UserT被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserT(String name) {

        this.name = name;
    }
}
