package com.mrh.mapper;

import com.mrh.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();


    //    添加用户
    public int add(User user);
    //    删除用户
    public int delete(int id);
    //    修改用户
    public void update();
    //    查询用户
    public void query();
}
