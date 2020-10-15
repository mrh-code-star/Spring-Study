package com.mrh.demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
//    public UserServiceProxy(){
//
//    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.add();
    }

    public void update() {
        log("update");
        userService.add();
    }

    public void select() {
        log("select");
        userService.add();
    }



    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
