package com.mrh.demo01;

import org.junit.Test;

public class Client {
    @Test
    public void rent(){
        Host host = new Host();
        host.rent();
    }
//    代理
    @Test
    public void rentByProxy(){
        Host host = new Host();
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}
