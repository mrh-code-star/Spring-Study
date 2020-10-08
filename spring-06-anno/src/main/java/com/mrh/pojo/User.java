package com.mrh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("马荣晖")
    public String name ;

    @Value("maronghui")
    public void setName(String name) {
        this.name = name;
    }
}
