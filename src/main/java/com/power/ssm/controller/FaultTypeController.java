package com.power.ssm.controller;

import com.power.ssm.common.Controller;
import com.power.ssm.model.FaultType;
import com.power.ssm.service.FaultTypeService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/types")
public class FaultTypeController implements Controller<FaultType> {

    @Resource
    FaultTypeService faultTypeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<FaultType> query(FaultType record) {
        return this.faultTypeService.query(record);
    }

    @Override
    public FaultType get(Integer pk) {
        return null;
    }

    @Override
    public int post(FaultType record) {
        return 0;
    }

    @Override
    public int put(FaultType record) {
        return 0;
    }

    @Override
    public int delete(FaultType record) {
        return 0;
    }
}
