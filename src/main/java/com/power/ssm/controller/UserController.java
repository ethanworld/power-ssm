package com.power.ssm.controller;

import com.power.ssm.common.Controller;
import com.power.ssm.common.Result;
import com.power.ssm.model.User;
import com.power.ssm.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/users")
public class UserController implements Controller<User> {

    @Resource
    UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public Result<User> query(User record) {
        return this.userService.query(record);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.GET)
    @Override
    public User get(@PathVariable Integer pk) {
        return this.userService.select(pk);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestBody User recode) {
        return this.userService.login(recode);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody User record) {
        return this.userService.insert(record);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @Override
    public int put(@RequestBody User record) {
        return this.userService.update(record);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    @Override
    public int delete(@RequestBody User recode) {
        return this.userService.delete(recode);
    }
}
