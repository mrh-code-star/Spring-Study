package com.mrh.demo04;

import com.mrh.demo02.UserService;
import com.mrh.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);

        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
        proxy.delete();
    }

}
