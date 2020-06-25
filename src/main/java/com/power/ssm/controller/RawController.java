package com.power.ssm.controller;


import com.power.ssm.model.Raw;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.alibaba.fastjson.JSON;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/rows")
public class RawController{


    public List<Raw> getList() {
        return null;
    }

    public Raw get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public int post(@RequestBody String record) {
        System.out.println(record);
        JSON jsonObject = JSONObject.parseObject(record);
        return 0;
    }

    public int put(Raw record) {
        return 0;
    }

    public int delete(Raw record) {
        return 0;
    }
}
