package com.mrh.service;

import com.mrh.dao.UserDao;
import com.mrh.dao.UserDaoImpl;
import com.mrh.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;


    //    利用set进行动态实现值的注入！！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }


}
