package com.mrh.demo02;

import org.junit.Test;

public class Client {
    @Test
    public void test1(){
        UserServiceImpl userService = new UserServiceImpl();

        userService.add();

    }
    @Test
    public void test2(){
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService(userService);

        userServiceProxy.add();


    }
}
