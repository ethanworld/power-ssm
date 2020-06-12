package com.power.ssm.dao;

import com.power.ssm.common.Dao;
import com.power.ssm.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends Dao<User> {

    int login(User recode);
}
