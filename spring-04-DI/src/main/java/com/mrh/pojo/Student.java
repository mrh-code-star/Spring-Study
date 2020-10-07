package com.mrh.pojo;

import java.util.*;

public class Student {
    private String name;
    private Address address;
    private String[] book;
    private List<String> hobbys;
    private Map<String,String> map;
    private String wife;
    private Set<String> game;
    private Properties info;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", book=" + Arrays.toString(book) +
                ", hobbys=" + hobbys +
                ", map=" + map +
                ", wife='" + wife + '\'' +
                ", game=" + game +
                ", info=" + info +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Set<String> getGame() {
        return game;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
