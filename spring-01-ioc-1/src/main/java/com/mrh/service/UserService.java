package com.mrh.service;

import com.mrh.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
