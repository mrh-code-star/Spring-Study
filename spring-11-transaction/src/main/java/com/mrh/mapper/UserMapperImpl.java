package com.mrh.mapper;

import com.mrh.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    public List<User> selectUser() {
        User user = new User(10, "向往", "9999999");

        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.add(user);
        mapper.delete(1);
        return mapper.selectUser();
    }

    public int add(User user) {


        return getSqlSession().getMapper(UserMapper.class).add(user);
    }

    public int delete(int id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }




    public void update() {

    }

    public void query() {

    }
}
