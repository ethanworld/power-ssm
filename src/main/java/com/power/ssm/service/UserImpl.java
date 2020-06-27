package com.power.ssm.service;

import com.power.ssm.dao.UserDao;
import com.power.ssm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserImpl implements UserService{

    @Resource
    UserDao userDao;

    @Override
    public User login(User recode) {
        int userId = this.userDao.login(recode);
        return this.userDao.select(userId);
    }

    @Override
    public int getId(User recode) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertList(List<User> records) {
        return 0;
    }

    @Override
    public int delete(User record) {
        return 0;
    }

    @Override
    public int update(User record) {
        return 0;
    }


    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public User select(Integer pk) {
        return null;
    }

}
