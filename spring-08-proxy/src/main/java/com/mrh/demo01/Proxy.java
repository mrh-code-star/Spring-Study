package com.mrh.demo01;

import java.util.HashMap;

public class Proxy implements Rent{
    private Host host;

//    看房
    public void seeHouse(){
        System.out.println("中介带你看房！！");
    }
    public void fare(){
        System.out.println("中介要收费！！");
    }
    public void heTong(){
        System.out.println("中介要签合同！！");
    }
    @Override
    public String toString() {
        return "Proxy{" +
                "host=" + host +
                '}';
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public Proxy(Host host) {

        this.host = host;
    }

    public void rent() {
        host.rent();
    }


}
