package com.power.ssm.service;

import com.power.ssm.common.Result;
import com.power.ssm.dao.UserDao;
import com.power.ssm.model.Fault;
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
        return this.userDao.login(recode);
    }

    @Override
    public int getId(User recode) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return this.userDao.insert(record);
    }

    @Override
    public int insertList(List<User> records) {
        return 0;
    }

    @Override
    public int delete(User record) {
        return this.userDao.delete(record);
    }

    @Override
    public int update(User record) {
        return this.userDao.update(record);
    }


    @Override
    public Result<User> query (User record) {
        Result<User> result = new Result<>();
        result.setData(this.userDao.query(record));
        return result;
    }

    @Override
    public User select(Integer pk) {
        return null;
    }

}
