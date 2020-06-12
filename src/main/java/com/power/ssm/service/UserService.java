package com.power.ssm.service;

import com.power.ssm.common.Service;
import com.power.ssm.model.User;

public interface UserService extends Service<User> {

    User login(User recode);
}
